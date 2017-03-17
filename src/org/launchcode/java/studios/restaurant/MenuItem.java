package org.launchcode.java.studios.restaurant;

import java.time.LocalDateTime;

/**
 * Created by J on 3/13/2017.
 */
public class MenuItem {

    private String description;
    private Double price;
    private String category;
    private final LocalDateTime created = LocalDateTime.now();

    public MenuItem(String description, Double price, String category){
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}