package com.example.currencyconverterspring.controllers;

import com.example.currencyconverterspring.services.CurrencyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }


}
