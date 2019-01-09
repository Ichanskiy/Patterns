package com.factory.store;

import com.factory.pizza.HomePizza;
import com.factory.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type, Integer size) {
        System.out.println("type = " + type);
        return new HomePizza(size);
    }
}
