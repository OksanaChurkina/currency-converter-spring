package com.example.currencyconverterspring.services;

import com.example.currencyconverterspring.models.Currency;
import com.example.currencyconverterspring.repositories.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CurrencyService {

    private CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository){

        this.currencyRepository = currencyRepository;
    }

    public List<Currency> getAllCurrencies(){
        List<Currency> list = this.currencyRepository.findAll();
        list.sort(Comparator.comparing(Currency::getName));

        return list;
    }
}
