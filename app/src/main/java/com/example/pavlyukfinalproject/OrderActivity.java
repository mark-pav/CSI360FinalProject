package com.example.pavlyukfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        List<Order> totalOrder = new ArrayList<>();
        totalOrder.add(new Order(new CoffeeDrink("latte", R.drawable.latte, "Classic Latte", 4), 2));
        totalOrder.add(new Order(new CoffeeDrink("latte", R.drawable.latte, "Classic Latte1", 4), 2));
        totalOrder.add(new Order(new CoffeeDrink("latte", R.drawable.latte, "Classic Latte2", 4), 23));

        for (int i = 0; i < totalOrder.size(); i++){
            
        }





        TextView tv = findViewById(R.id.textView4);
        tv.setText(totalOrder.toString());
    }
}