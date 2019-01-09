package com.factory;

import com.factory.pizza.Pizza;
import com.factory.store.ChicagoPizzaStore;
import com.factory.store.NewYorkPizzaStore;
import com.factory.store.PizzaStore;

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
