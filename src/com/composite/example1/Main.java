package com.composite.example1;

public class Main {

    public static void main(String[] args) {
        Menu dinerMenu = new Menu("breakfast", "dinner description");
        Menu cafeMenu = new Menu("lunch", "lunch description");
        Menu dessertMenu = new Menu("dessert", "dessert description");

        Menu allMenu = new Menu("all menus", "all menus");
        allMenu.add(dessertMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dinerMenu);

        dessertMenu.add(new MenuItem("cake", "cake description", false, 10.99));
        cafeMenu.add(new MenuItem("tea", "tea description", true, 0.79));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenus();

    }

}
