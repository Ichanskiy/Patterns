package com.abstractFactory.store;

import com.abstractFactory.ingredient.factory.ChicagoPizzaIngredientFactory;
import com.abstractFactory.ingredient.factory.PizzaIngredientFactory;
import com.abstractFactory.pizza.Pizza;
import com.abstractFactory.pizza.VegetarianPizza;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type, Integer size) {
        System.out.println("type = " + type);
        return new VegetarianPizza(pizzaIngredientFactory);
    }
}
