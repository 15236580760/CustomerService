package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriceTimeController {

    @RequestMapping("price-time")
    public String priceTime() {
        return "price-time.html";
    }
}
