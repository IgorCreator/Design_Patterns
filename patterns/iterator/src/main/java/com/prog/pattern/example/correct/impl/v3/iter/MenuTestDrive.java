package com.prog.pattern.example.correct.impl.v3.iter;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        List<Menu> menuItems = new ArrayList<Menu>() {{
            add(pancakeHouseMenu);
            add(dinerMenu);
            add(cafeMenu);
        }};

        Waitress waitress = new Waitress(menuItems);
        waitress.printMenu();
    }
}
