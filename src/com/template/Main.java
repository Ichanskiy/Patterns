package com.template;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }

}
