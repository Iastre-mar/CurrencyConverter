package currencyconverter.view;

import currencyconverter.controller.CurrencyController;
import currencyconverter.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(CurrencyController controller);
}
