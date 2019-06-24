package com.leszko.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/operation")
    public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b, @RequestParam("c") String c) {
        String resultat = "";        
        String d = "";

        if (c.equals("add")) {
            d = "+";
        }
        else if (c.equals("subs")) {
            d = "-";
        }
        else if (c.equals("mult")) {
            d = "*";
        }
        else if (c.equals("div")) {
            d = "/";
        }

        resultat = a + " " + d + " " + b + " = " + String.valueOf(calculator.operation(a, b, c));        
        
        return resultat;
    }
}