package currencyconverter;

import currencyconverter.model.CurrencyDAO;
import currencyconverter.dto.CurrencyDTO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyDAO currencyDao = new CurrencyDAO();

        List<CurrencyDTO> currencies = currencyDao.getAllCurrencies();
        System.out.println("Все валюты:");
        currencies.forEach(System.out::println);

        CurrencyDTO usd = currencyDao.getCurrencyById(1);
        System.out.println("\nВалюта с ID=1:");
        System.out.println(usd);
    }
}