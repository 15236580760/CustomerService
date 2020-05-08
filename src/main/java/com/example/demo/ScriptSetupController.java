package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScriptSetupController {

    @RequestMapping("/script-setup")
    public String scriptSetup() {
        return "script-setup.html";
    }
}
