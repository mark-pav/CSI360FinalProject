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

    public CoffeeDrink getDrink() {
        return drink;
    }

    public void setDrink(CoffeeDrink drink) {
        this.drink = drink;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
