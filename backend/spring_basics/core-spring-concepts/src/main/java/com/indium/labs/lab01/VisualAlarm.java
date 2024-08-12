package com.indium.labs.lab01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class VisualAlarm implements Alarm {
    @Override
    public void activate() {
        System.out.println("VisualAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("VisualAlarm deactivated");
    }
}
