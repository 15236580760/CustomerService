package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriceLinkagePackageController {

    @RequestMapping("/price-linkage-package")
    public String priceLinkagePackage() {
        return "price-linkage-package";
    }
}
