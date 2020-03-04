package com.prog.pattern.example.incorrect.impl.v1.prog;

import java.util.ArrayList;

public class Waitress {

    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        //for (MenuItem menuItem : breakfastItems) {
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        //for (MenuItem menuItem : lunchItems) {
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu(){

    }

    public void printLunchMenu(){

    }

    public void printVegetarianMenu(){

    }

    public boolean isItemVegetarian(MenuItem item){
        return false;
    }
}
