package currencyconverter.controller;

import currencyconverter.model.Model;
import currencyconverter.model.ModelData;
import currencyconverter.view.View;

public class CurrencyController implements Controller{
    private Model model;
    private View readView;


    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    public void setReadView(View view){
        this.readView = view;
    }

    public void onGetAllCurrencies(){
        this.model.getAllCurrencies();
        ModelData modelData = this.model.getModelData();
        this.readView.refresh(modelData);
    }

    public void onGetCurrencyByCode(String code){
        this.model.getCurrencyByCode(code);
        ModelData modelData = this.model.getModelData();
        this.readView.refresh(modelData);
    }
}
