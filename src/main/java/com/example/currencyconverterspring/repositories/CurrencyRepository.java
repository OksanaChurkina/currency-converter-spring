package com.example.currencyconverterspring.repositories;

import com.example.currencyconverterspring.models.Currency;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, String> {

    @Override
    List<Currency> findAll();
}
