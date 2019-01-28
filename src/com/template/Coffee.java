package com.template;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar into coffee");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee trout filter");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
