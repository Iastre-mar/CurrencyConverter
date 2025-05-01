package currencyconverter;

import currencyconverter.controller.CurrencyController;
import currencyconverter.model.CurrencyDAO;
import currencyconverter.dto.CurrencyDTO;
import currencyconverter.model.Model;
import currencyconverter.view.ReadView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Model model = new CurrencyDAO();
        CurrencyController controller = new CurrencyController();
        ReadView readView = new ReadView();

        controller.setModel(model);
        controller.setReadView(readView);

        readView.setController(controller);

        readView.fireEventGetAllCurrencies();
        List<CurrencyDTO> currencies = readView.getCurrentDTOList();
        System.out.println("Все валюты:");
        currencies.forEach(System.out::println);

        readView.fireEventGetCurrencyByCode("USD");
        CurrencyDTO usd = readView.getCurrentDTO();
        System.out.println("\nВалюта USD:");
        System.out.println(usd);
    }
}