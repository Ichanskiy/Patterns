package com.abstractFactory.pizza;

import com.abstractFactory.ingredient.Dough;
import com.abstractFactory.ingredient.Sauce;
import com.abstractFactory.ingredient.factory.PizzaIngredientFactory;

public abstract class Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    private String type = "Pattern";
    Integer size;
    Dough dough;
    Sauce sauce;

    public void prepare(){
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauche();
    }

    public void cut(){
        System.out.println("cutting");
    }
    public void box(){
        System.out.println("boxing");
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
