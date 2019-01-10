package com.abstractFactory;

import com.abstractFactory.pizza.Pizza;
import com.abstractFactory.store.ChicagoPizzaStore;
import com.abstractFactory.store.NewYorkPizzaStore;
import com.abstractFactory.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("new york type", 10);
        System.out.println("pizza = " + pizza);
        PizzaStore pizzaStore2 = new ChicagoPizzaStore();
        pizza = pizzaStore2.orderPizza("new york type", 10);
        System.out.println("pizza = " + pizza);
    }
}
