package com.abstractFactory.pizza;

import com.abstractFactory.ingredient.factory.PizzaIngredientFactory;

public class VegetarianPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VegetarianPizza(Integer size) {
        super.size = size;
    }

    public VegetarianPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauche();
    }

    @Override
    public void cut() {
        System.out.println("Cut square");
    }
}
