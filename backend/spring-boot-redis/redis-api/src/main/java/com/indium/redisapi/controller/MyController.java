package com.indium.redisapi.controller;

import com.indium.redisapi.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/capital/{country}")
    public String getCapitalOf(@PathVariable String country) {
        return myService.getCapitalOf(country);
    }

    @GetMapping("/clearCache/{country}")
    public String clearCache(@PathVariable String country) {
        myService.clearCache(country);
        return "Cache cleared for " + country;
    }
}
