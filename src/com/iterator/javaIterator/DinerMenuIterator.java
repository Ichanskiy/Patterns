package com.iterator.javaIterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    private int position = 0;
    private MenuItem[] menuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("error remove");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
