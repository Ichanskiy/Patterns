package com.factory.pizza;

public class VegetarianPizza extends Pizza {

    public VegetarianPizza(Integer size) {
        super.size = size;
    }

    @Override
    public void cut() {
        System.out.println("Cut square");
    }
}
