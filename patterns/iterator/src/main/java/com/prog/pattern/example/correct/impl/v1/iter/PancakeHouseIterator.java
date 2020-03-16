package com.prog.pattern.example.correct.impl.v1.iter;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }
}
