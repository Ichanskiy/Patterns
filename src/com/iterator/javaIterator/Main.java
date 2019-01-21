package com.iterator.javaIterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Menu houseMenu = new PancakeHouseMenu();

        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }

        iterator = houseMenu.createIterator();
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
