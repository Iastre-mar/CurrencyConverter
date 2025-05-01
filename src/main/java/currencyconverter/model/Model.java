package currencyconverter.model;

public interface Model {
    ModelData getModelData();

    void getAllCurrencies();

    void getCurrencyByCode(String code);
}
