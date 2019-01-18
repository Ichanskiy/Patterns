package com.iterator.customIterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position + 1 <= menuItems.size();
    }

    @Override
    public Object next() {
        Object object = menuItems.get(position);
        ++position;
        return object;
    }
}
