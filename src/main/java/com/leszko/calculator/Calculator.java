package com.leszko.calculator;

import org.springframework.stereotype.Service;

@Service
class Calculator {
    int operation(int a, int b, String c) {
        
        int result = 0;

        if (c.equals("add")) {
            result =  a + b;
        }
        else if (c.equals("subs")) {
            result = a - b;
        }
        else if (c.equals("mult")) {
            result = a * b;
        }
        else if (c.equals("div")) {
            result = a / b;
        }
        

        return result;
        
    }
}