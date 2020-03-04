package com.prog.pattern.example.correct.impl.v3.iter;

import java.util.ArrayList;
import java.util.Iterator;

public class DesertMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public DesertMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("Ice Cream",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Tire Missu",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Cheescake",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
