package com.indium;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Company {
    public Company() {
        System.out.println("*** Company object created");
    }
}
