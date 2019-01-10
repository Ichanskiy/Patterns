package com.abstractFactory.ingredient.factory;

import com.abstractFactory.ingredient.Dough;
import com.abstractFactory.ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauche();
}
