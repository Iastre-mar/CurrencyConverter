package currencyconverter.model.service;

import currencyconverter.dto.CurrencyDTO;

import java.util.List;

public interface CurrencyService {

    List<CurrencyDTO> getAllCurrencies();

    CurrencyDTO getCurrencyByCode(String code);

    CurrencyDTO createCurrency(CurrencyDTO dto);

}
