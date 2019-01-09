package com.factory.store;

import com.factory.pizza.Pizza;
import com.factory.pizza.VegetarianPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type, Integer size) {
        System.out.println("type = " + type);
        return new VegetarianPizza(size);
    }
}
