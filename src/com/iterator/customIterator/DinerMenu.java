package com.iterator.customIterator;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int position = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Blt", true, 2.10);
        addItem("Bacon", false, 2.99);
        addItem("Soup", false, 10.99);
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name, boolean vegetarian, double cost) {
        MenuItem menuItem = new MenuItem(name, vegetarian, cost);
        if (position >= MAX_ITEMS) {
            System.out.println("error add");
        } else {
            menuItems[position] = menuItem;
            position++;
        }
    }
}
