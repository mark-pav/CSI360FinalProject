package com.example.pavlyukfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LatteActivity extends AppCompatActivity {

    CoffeeDrink classicLatte = new CoffeeDrink("latte", R.drawable.latte, "Classic Latte", 4);
    CoffeeDrink chocolateLatte = new CoffeeDrink("latte", R.drawable.chocolate_latte, "Choco Latte", 4.55);
    CoffeeDrink vanillaLatte = new CoffeeDrink("latte", R.drawable.vanilla_latte, "Vanilla Latte", 4.75);
    CoffeeDrink caramelLatte = new CoffeeDrink("latte", R.drawable.caramel_latte, "Caramel Latte", 4.75);
    CoffeeDrink cinamonLatte = new CoffeeDrink("latte", R.drawable.cinamon_latte, "Cinnamon Latte", 4.75);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latte);

        ImageView img1 = findViewById(R.id.latte_image1);
        img1.setImageResource(classicLatte.image);
        TextView txt1 = findViewById(R.id.latte_discr1);
        txt1.setText(classicLatte.description);
        TextView price1 = findViewById(R.id.latte_price1);
        price1.setText("$" + Double.toString(classicLatte.price));

        Button btn1 = findViewById(R.id.latteOrderBtn1);
        EditText qty1 = findViewById(R.id.latte_qty1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.updateOrder(new Order(classicLatte, Integer.getInteger(qty1.getText().toString())));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        ImageView img2 = findViewById(R.id.latte_image2);
        img2.setImageResource(chocolateLatte.image);
        TextView txt2 = findViewById(R.id.latte_discr2);
        txt2.setText(chocolateLatte.description);
        TextView price2 = findViewById(R.id.latte_price2);
        price2.setText("$" + Double.toString(chocolateLatte.price));

        Button btn2 = findViewById(R.id.latteOrderBtn2);
        EditText qty2 = findViewById(R.id.latte_qty2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.updateOrder(new Order(classicLatte, Integer.getInteger(qty2.getText().toString())));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        ImageView img3 = findViewById(R.id.latte_image3);
        img3.setImageResource(vanillaLatte.image);
        TextView txt3 = findViewById(R.id.latte_discr3);
        txt3.setText(vanillaLatte.description);
        TextView price3 = findViewById(R.id.latte_price3);
        price3.setText("$" + Double.toString(vanillaLatte.price));





        ImageView img4 = findViewById(R.id.latte_image4);
        img4.setImageResource(caramelLatte.image);
        TextView txt4 = findViewById(R.id.latte_discr4);
        txt4.setText(caramelLatte.description);
        TextView price4 = findViewById(R.id.latte_price4);
        price4.setText("$" + Double.toString(caramelLatte.price));





        ImageView img5 = findViewById(R.id.latte_image5);
        img5.setImageResource(cinamonLatte.image);
        TextView txt5 = findViewById(R.id.latte_discr5);
        txt5.setText(cinamonLatte.description);
        TextView price5 = findViewById(R.id.latte_price5);
        price5.setText("$" + Double.toString(cinamonLatte.price));

    }
}