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

    CoffeeDrink classicLatte = new CoffeeDrink("latte", R.drawable.latte, "Classic Latte", 4.25);
    CoffeeDrink chocolateLatte = new CoffeeDrink("latte", R.drawable.chocolate_latte, "Choco Latte", 4.55);
    CoffeeDrink vanillaLatte = new CoffeeDrink("latte", R.drawable.vanilla_latte, "Vanilla Latte", 4.75);
    CoffeeDrink caramelLatte = new CoffeeDrink("latte", R.drawable.caramel_latte, "Caramel Latte", 4.75);
    CoffeeDrink cinamonLatte = new CoffeeDrink("latte", R.drawable.cinamon_latte, "Cinnamon Latte", 4.75);

    int countToAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latte);

        //Everything for classic latte
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
                countToAddToCart = Integer.parseInt(qty1.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(classicLatte, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Chocolate Latte
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
                countToAddToCart = Integer.parseInt(qty2.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(chocolateLatte, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Vanilla Latte
        ImageView img3 = findViewById(R.id.latte_image3);
        img3.setImageResource(vanillaLatte.image);
        TextView txt3 = findViewById(R.id.latte_discr3);
        txt3.setText(vanillaLatte.description);
        TextView price3 = findViewById(R.id.latte_price3);
        price3.setText("$" + Double.toString(vanillaLatte.price));

        Button btn3 = findViewById(R.id.latteOrderBtn3);
        EditText qty3 = findViewById(R.id.latte_qty3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty3.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(vanillaLatte, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for Caramel Latte
        ImageView img4 = findViewById(R.id.latte_image4);
        img4.setImageResource(caramelLatte.image);
        TextView txt4 = findViewById(R.id.latte_discr4);
        txt4.setText(caramelLatte.description);
        TextView price4 = findViewById(R.id.latte_price4);
        price4.setText("$" + Double.toString(caramelLatte.price));

        Button btn4 = findViewById(R.id.latteOrderBtn4);
        EditText qty4 = findViewById(R.id.latte_qty4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty4.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(caramelLatte, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for cinamon latte
        ImageView img5 = findViewById(R.id.latte_image5);
        img5.setImageResource(cinamonLatte.image);
        TextView txt5 = findViewById(R.id.latte_discr5);
        txt5.setText(cinamonLatte.description);
        TextView price5 = findViewById(R.id.latte_price5);
        price5.setText("$" + Double.toString(cinamonLatte.price));

        Button btn5 = findViewById(R.id.latteOrderBtn5);
        EditText qty5 = findViewById(R.id.latte_qty5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty5.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(cinamonLatte, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button exitBtn = findViewById(R.id.latteBackBTN);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}