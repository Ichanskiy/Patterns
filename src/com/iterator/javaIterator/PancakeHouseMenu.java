package com.iterator.javaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("BPancake", true, 1.10);
        addItem("Berry", false, 9.99);
        addItem("Waffles", false, 7.99);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public void addItem(String name, boolean vegetarian, double cost) {
        MenuItem menuItem = new MenuItem(name, vegetarian, cost);
        menuItems.add(menuItem);
    }
}
