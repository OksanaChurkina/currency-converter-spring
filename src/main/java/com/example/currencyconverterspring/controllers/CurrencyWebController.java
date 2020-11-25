package com.example.currencyconverterspring.controllers;

import com.example.currencyconverterspring.models.ConversionCurrency;
import com.example.currencyconverterspring.tasks.CbrParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Optional;

@Controller
public class CurrencyWebController {

    @Autowired
    private CbrParser cbrParser;


    @GetMapping("/")
    public String getAllCurrencies(@RequestParam(value="name", required=false, defaultValue="World")String name, Model model)
           {
        model.addAttribute("exchangeRates", cbrParser.getXML());
        return "index";
    }

}
