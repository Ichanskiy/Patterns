package com.iterator.customIterator;

public class Main {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu houseMenu = new PancakeHouseMenu();

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
