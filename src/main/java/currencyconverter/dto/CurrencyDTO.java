package currencyconverter.dto;

public record CurrencyDTO(int id, String code, String fullName, String sign) {
    public CurrencyDTO(String code, String fullName, String sign) {
        this(0, code, fullName, sign);
    }
}
