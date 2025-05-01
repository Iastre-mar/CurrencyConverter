package currencyconverter.model;

import java.util.List;

import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.service.CurrencyService;
import currencyconverter.model.service.CurrencyServiceImpl;

public class CurrencyModel implements Model {
    private final CurrencyService service = new CurrencyServiceImpl();
    private final ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void getAllCurrencies() {
        List<CurrencyDTO> allCurrencies = service.getAllCurrencies();
        modelData.setCurrencies(allCurrencies);
    }

    @Override
    public void getCurrencyByCode(String code) {
        CurrencyDTO activeCurrency = service.getCurrencyByCode(code);
        modelData.setActiveCurrency(activeCurrency);
    }

}