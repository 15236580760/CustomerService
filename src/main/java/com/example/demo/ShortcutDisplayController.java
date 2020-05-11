package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShortcutDisplayController {

    @RequestMapping("/shortcut-display")
    public String shortcutDisplay() {
        return "shortcut-display.html";
    }
}
