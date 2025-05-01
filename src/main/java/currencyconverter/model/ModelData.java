package currencyconverter.model;

import currencyconverter.dto.CurrencyDTO;

import java.util.List;

public class ModelData {
    private List<CurrencyDTO> currencies;
    private CurrencyDTO activeCurrency;

    public CurrencyDTO getActiveCurrency() {
        return activeCurrency;
    }

    public void setActiveСurrency(CurrencyDTO activeCurrency) {
        this.activeCurrency = activeCurrency;
    }

    public List<CurrencyDTO> getСurrencies() {
        return currencies;
    }

    public void setСurrencies(List<CurrencyDTO> currencies) {
        this.currencies = currencies;
    }
}
