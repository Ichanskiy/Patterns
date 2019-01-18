package com.iterator.customIterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("BPancake", true, 1.10);
        addItem("Berry", false, 9.99);
        addItem("Waffles", false, 7.99);
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

    public void addItem(String name, boolean vegetarian, double cost) {
        MenuItem menuItem = new MenuItem(name, vegetarian, cost);
        menuItems.add(menuItem);
    }
}
