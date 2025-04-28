package currencyconverter.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import currencyconverter.dto.CurrencyDTO;

public class CurrencyDAO {

    public List<CurrencyDTO> getAllCurrencies() {
        List<CurrencyDTO> currencies = new ArrayList<>();

        String sql = "SELECT id, code, fullname, sign FROM currencies";

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                CurrencyDTO currency = new CurrencyDTO(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("fullname"),
                        rs.getString("sign")
                );
                currencies.add(currency);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }

    public CurrencyDTO getCurrencyById(int id) {
        String sql = "SELECT id, code, fullname, sign FROM currencies WHERE id = ?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new CurrencyDTO(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("fullname"),
                        rs.getString("sign")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}