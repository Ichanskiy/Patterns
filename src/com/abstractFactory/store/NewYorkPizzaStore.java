package com.abstractFactory.store;

import com.abstractFactory.ingredient.factory.NYPizzaIngredientFactory;
import com.abstractFactory.ingredient.factory.PizzaIngredientFactory;
import com.abstractFactory.pizza.HomePizza;
import com.abstractFactory.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    private PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type, Integer size) {
        System.out.println("type = " + type);
        return new HomePizza(pizzaIngredientFactory);
    }
}
