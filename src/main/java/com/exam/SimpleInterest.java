package com.exam;

public class SimpleInterest {
    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}