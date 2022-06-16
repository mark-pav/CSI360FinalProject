package com.example.pavlyukfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int drinkCountTotal;
    Button btn;
    public static List<Order> currentOrder = new ArrayList<>();


    public static void updateOrder(Order order){
        if (order.drink.type == "latte"){
            currentOrder.add(order);
        } // add more elseif for other types
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.long_press_button);
        registerForContextMenu(btn);



        //what happens on regular click (not long press)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                intent.putExtra("totalOrder", (Serializable) currentOrder);

                startActivity(intent);
            }
        });

        //what happens when cart icon is clicked
        findViewById(R.id.cartButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

        //what happens when drink counter is clicked
        TextView drinksInCartTotalTV = findViewById(R.id.drinksInCartTV);
        drinksInCartTotalTV.setText(Integer.toString(drinkCountTotal));
        drinksInCartTotalTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });



    }


    //applies menu from res to the long press ContextMenu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose type of coffee");
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
    }

    //what happens when each item selected from long press ContextMenu
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.latte_menu_option){
            Intent intent = new Intent(this, LatteActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.mocha_menu_option){
            Intent intent = new Intent(this, MochaActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.americano_menu_option){
            Intent intent = new Intent(this, AmericanoActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onContextItemSelected(item);

    }
}