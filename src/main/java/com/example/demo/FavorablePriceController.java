package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FavorablePriceController {

    @RequestMapping("/favorable-price")
    public String favorablePrice() {
        return "favorable-price.html";
    }
}
