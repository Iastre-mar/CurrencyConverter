package currencyconverter;

import currencyconverter.controller.CurrencyController;
import currencyconverter.model.CurrencyModel;
import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.Model;
import currencyconverter.view.CreateView;
import currencyconverter.view.ReadView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Model model = new CurrencyModel();
        CurrencyController controller = new CurrencyController();
        ReadView readView = new ReadView();
        CreateView createView = new CreateView();

        controller.setModel(model);
        controller.setReadView(readView);
        controller.setCreateView(createView);


        readView.setController(controller);
        createView.setController(controller);

        readView.fireEventGetAllCurrencies();
        List<CurrencyDTO> currencies = readView.getCurrentDTOList();
        System.out.println("Все валюты:");
        currencies.forEach(System.out::println);

        readView.fireEventGetCurrencyByCode("USD");
        CurrencyDTO usd = readView.getCurrentDTO();
        System.out.println("\nВалюта USD:");
        System.out.println(usd);

        createView.fireEventCreateCurrency("RU", "RUBLE", "P");
        CurrencyDTO ru = createView.getCurrentDTO();
        System.out.println("\nСозданная валюта:");
        System.out.println(ru);




    }
}