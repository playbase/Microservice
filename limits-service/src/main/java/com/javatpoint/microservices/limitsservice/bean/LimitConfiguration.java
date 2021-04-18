package com.javatpoint.microservices.limitsservice.bean;

import org.springframework.stereotype.Component;

@Component
public class LimitConfiguration {
    private int maximum;
    private int minimum;

    //generating getters
    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
