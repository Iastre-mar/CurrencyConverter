package currencyconverter.view;

import currencyconverter.controller.CurrencyController;
import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.ModelData;

import java.util.List;

public class CreateView implements View{
    private CurrencyController controller;
    private CurrencyDTO currentDTO;

    @Override
    public void refresh(ModelData modelData) {
        currentDTO = modelData.getActiveCurrency();
    }

    @Override
    public void setController(CurrencyController controller) {
        this.controller = controller;
    }

    public void fireEventCreateCurrency(String code, String fullname, String sign){
        this.controller.onCreateCurrency(new CurrencyDTO(code, fullname, sign));
    }

    public CurrencyDTO getCurrentDTO() {
        return currentDTO;
    }

}
