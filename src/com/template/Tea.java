package com.template;

public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon into tea");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
