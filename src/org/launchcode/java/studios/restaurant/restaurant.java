package org.launchcode.java.studios.restaurant;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by J on 3/16/2017.
 */
public class restaurant {

    public static Menu createMenu(ArrayList<MenuItem> menuItems){
        Menu newMenu = new Menu();

        newMenu.setItems(menuItems);

        return newMenu;

    }

    public static void printMenu(Menu menu) {
        for (MenuItem item : menu.getItems()) {
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Price: " + item.getPrice());
            if (item.getCreated().isAfter(LocalDateTime.now().minusMonths(1))) {
                System.out.println("New item!");
            }
            if (Duration.between(item.getCreated(), LocalDateTime.now()).toDays() < 30) {
                System.out.println("New item!");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<MenuItem> newItems = new ArrayList<>();
        MenuItem turkey = new MenuItem("Turkey",3.50,"dessert");
        newItems.add(turkey);
        Menu myMenu = createMenu(newItems);
        printMenu(myMenu);
    }
}
