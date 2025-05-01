package currencyconverter.model.service;

import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.DatabaseManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyServiceImpl implements CurrencyService{

    @Override
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

    @Override
    public CurrencyDTO getCurrencyByCode(String code) {
        CurrencyDTO resDTO = null;
        String sql = "SELECT id, code, fullname, sign FROM currencies WHERE code = ?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, code);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                resDTO = new CurrencyDTO(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("fullname"),
                        rs.getString("sign")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resDTO;
    }

    @Override
    public void createCurrency(CurrencyDTO dto) {

    }
}
