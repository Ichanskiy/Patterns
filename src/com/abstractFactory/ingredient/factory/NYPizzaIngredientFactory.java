package com.abstractFactory.ingredient.factory;

import com.abstractFactory.ingredient.Dough;
import com.abstractFactory.ingredient.MarinaraSauce;
import com.abstractFactory.ingredient.Sauce;
import com.abstractFactory.ingredient.TrinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough(){
        return new TrinCrustDough();
    }

    public Sauce createSauche(){
        return new MarinaraSauce();
    }
}