package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WordSetupController {

    @RequestMapping("/word-setup")
    public String welcome() {
        return "word-setup.html";
    }
}
