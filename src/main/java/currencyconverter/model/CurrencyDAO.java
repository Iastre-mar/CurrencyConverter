package currencyconverter.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.service.CurrencyService;
import currencyconverter.model.service.CurrencyServiceImpl;

public class CurrencyDAO implements Model {
    private CurrencyService service = new CurrencyServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void getAllCurrencies() {
        List<CurrencyDTO> allCurrencies = service.getAllCurrencies();
        modelData.setСurrencies(allCurrencies);
    }

    @Override
    public void getCurrencyByCode(String code) {
        CurrencyDTO activeCurrency = service.getCurrencyByCode(code);
        modelData.setActiveСurrency(activeCurrency);
    }

}