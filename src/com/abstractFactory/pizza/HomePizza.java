package com.abstractFactory.pizza;

import com.abstractFactory.ingredient.factory.PizzaIngredientFactory;

public class HomePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public HomePizza(Integer size) {
        super.size = size;
    }

    public HomePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare(){
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauche();
    }
}
