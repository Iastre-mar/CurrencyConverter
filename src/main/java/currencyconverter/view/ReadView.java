package currencyconverter.view;

import currencyconverter.controller.CurrencyController;
import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.ModelData;

import java.util.List;

public class ReadView implements View {
    private CurrencyController controller;
    private CurrencyDTO currentDTO;
    private List<CurrencyDTO> currentDTOList;

    @Override
    public void refresh(ModelData modelData) {
        currentDTO = modelData.getActiveCurrency();
        currentDTOList = modelData.getСurrencies();
    }

    @Override
    public void setController(CurrencyController controller) {
        this.controller = controller;
    }

    public void fireEventGetAllCurrencies(){
        this.controller.onGetAllCurrencies();
    }

    public void fireEventGetCurrencyByCode(String code){
        this.controller.onGetCurrencyByCode(code);
    }

    public CurrencyDTO getCurrentDTO() {
        return currentDTO;
    }

    public List<CurrencyDTO> getCurrentDTOList() {
        return currentDTOList;
    }
}
