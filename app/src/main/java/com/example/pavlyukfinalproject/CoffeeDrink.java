package com.example.pavlyukfinalproject;

import java.io.Serializable;

public class CoffeeDrink implements Serializable {
    String type;
    int image;
    String description;
    double price;

    public CoffeeDrink(String type, int image, String description, double price) {
        this.type = type;
        this.image = image;
        this.description = description;
        this.price = price;
    }
}
