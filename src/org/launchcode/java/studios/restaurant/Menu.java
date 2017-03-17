package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

/**
 * Created by J on 3/13/2017.
 */
public class Menu {

    private ArrayList<MenuItem> items = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public Double averageMenuItemPrice(){
        return null;
    }


}