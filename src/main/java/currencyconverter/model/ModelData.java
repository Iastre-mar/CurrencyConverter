package currencyconverter.model;

import currencyconverter.dto.CurrencyDTO;

import java.util.List;

public class ModelData {
    private List<CurrencyDTO> currencies;
    private CurrencyDTO activeCurrency;

    public CurrencyDTO getActiveCurrency() {
        return activeCurrency;
    }

    public void setActiveCurrency(CurrencyDTO activeCurrency) {
        this.activeCurrency = activeCurrency;
    }

    public List<CurrencyDTO> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrencyDTO> currencies) {
        this.currencies = currencies;
    }


}
