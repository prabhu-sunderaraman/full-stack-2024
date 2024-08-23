package com.indium.spring_boot_rest_api.lab04.controller;

import com.indium.spring_boot_rest_api.lab04.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @Autowired
    private List<String> operations;

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return calculatorService.add(a, b);
    }

    @PutMapping("/square/{num}")
    public int square(@PathVariable int num) {
        return calculatorService.square(num);
    }

    @PostMapping("/product")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/operations")
    public List<String> getOperations() {
        return operations;
    }

}
