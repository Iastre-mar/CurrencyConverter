package currencyconverter.controller;

import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.Model;
import currencyconverter.model.ModelData;
import currencyconverter.view.View;

public class CurrencyController implements Controller{
    private Model model;
    private View readView;
    private View createView;


    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    public void setReadView(View view){
        this.readView = view;
    }

    public void setCreateView(View view){
        this.createView = view;
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

    public void onCreateCurrency(CurrencyDTO dto){
        this.model.createCurrency(dto);
        ModelData modelData = this.model.getModelData();
        this.createView.refresh(modelData);
    }
}
