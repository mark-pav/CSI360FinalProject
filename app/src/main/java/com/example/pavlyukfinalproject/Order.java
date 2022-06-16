package com.example.pavlyukfinalproject;

import java.io.Serializable;

public class Order implements Serializable {
    CoffeeDrink drink;
    int count;

    public Order() {
    }

    public Order(CoffeeDrink drink, int count) {
        this.drink = drink;
        this.count = count;
    }

}
