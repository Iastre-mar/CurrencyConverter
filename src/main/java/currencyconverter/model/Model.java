package currencyconverter.model;

import currencyconverter.dto.CurrencyDTO;

public interface Model {
    ModelData getModelData();

    void getAllCurrencies();

    void getCurrencyByCode(String code);

    void createCurrency(CurrencyDTO currencyDTO);
}
