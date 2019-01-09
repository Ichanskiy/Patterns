package com.factory.store;

import com.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type, Integer size){
        Pizza pizza;
        pizza = createPizza(type, size);
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type, Integer size);
}
