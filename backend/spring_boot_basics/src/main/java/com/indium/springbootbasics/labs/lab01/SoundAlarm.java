package com.indium.springbootbasics.labs.lab01;

import org.springframework.stereotype.Component;

@Component
public class SoundAlarm implements Alarm {
    @Override
    public void activate() {
        System.out.println("**** SoundAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("**** SoundAlarm deactivated");
    }
}
