package com.example.pavlyukfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MochaActivity extends AppCompatActivity {

    CoffeeDrink classicMocha = new CoffeeDrink("mocha", R.drawable.mocha, "Classic Mocha", 5.51);
    CoffeeDrink vanillaMocha = new CoffeeDrink("mocha", R.drawable.vanilla_mocha, "Vanilla Mocha", 5.75);
    CoffeeDrink caramelMocha = new CoffeeDrink("mocha", R.drawable.caramel_mocha, "Caramel Mocha", 5.92);
    CoffeeDrink cinamonMocha = new CoffeeDrink("mocha", R.drawable.cinamon_mocha, "Cinnamon Mocha", 5.25);
    CoffeeDrink berryMocha = new CoffeeDrink("mocha", R.drawable.berry_mocha, "Berry Mocha", 6.55);

    int countToAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocha);


        //Everything for classic latte
        ImageView img1 = findViewById(R.id.mocha_image1);
        img1.setImageResource(classicMocha.image);
        TextView txt1 = findViewById(R.id.mocha_discr1);
        txt1.setText(classicMocha.description);
        TextView price1 = findViewById(R.id.mocha_price1);
        price1.setText("$" + Double.toString(classicMocha.price));

        Button btn1 = findViewById(R.id.mochaOrderBtn1);
        EditText qty1 = findViewById(R.id.mocha_qty1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty1.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(classicMocha, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Berry Mocha
        ImageView img2 = findViewById(R.id.mocha_image2);
        img2.setImageResource(berryMocha.image);
        TextView txt2 = findViewById(R.id.mocha_discr2);
        txt2.setText(berryMocha.description);
        TextView price2 = findViewById(R.id.mocha_price2);
        price2.setText("$" + Double.toString(berryMocha.price));

        Button btn2 = findViewById(R.id.mochaOrderBtn2);
        EditText qty2 = findViewById(R.id.mocha_qty2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty2.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(berryMocha, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Vanilla Mocha
        ImageView img3 = findViewById(R.id.mocha_image3);
        img3.setImageResource(vanillaMocha.image);
        TextView txt3 = findViewById(R.id.mocha_discr3);
        txt3.setText(vanillaMocha.description);
        TextView price3 = findViewById(R.id.mocha_price3);
        price3.setText("$" + Double.toString(vanillaMocha.price));

        Button btn3 = findViewById(R.id.mochaOrderBtn3);
        EditText qty3 = findViewById(R.id.mocha_qty3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty3.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(vanillaMocha, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for Caramel Mocha
        ImageView img4 = findViewById(R.id.mocha_image4);
        img4.setImageResource(caramelMocha.image);
        TextView txt4 = findViewById(R.id.mocha_discr4);
        txt4.setText(caramelMocha.description);
        TextView price4 = findViewById(R.id.mocha_price4);
        price4.setText("$" + Double.toString(caramelMocha.price));

        Button btn4 = findViewById(R.id.mochaOrderBtn4);
        EditText qty4 = findViewById(R.id.mocha_qty4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty4.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(caramelMocha, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for cinamon mocha
        ImageView img5 = findViewById(R.id.mocha_image5);
        img5.setImageResource(cinamonMocha.image);
        TextView txt5 = findViewById(R.id.mocha_discr5);
        txt5.setText(cinamonMocha.description);
        TextView price5 = findViewById(R.id.mocha_price5);
        price5.setText("$" + Double.toString(cinamonMocha.price));

        Button btn5 = findViewById(R.id.mochaOrderBtn5);
        EditText qty5 = findViewById(R.id.mocha_qty5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty5.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(cinamonMocha, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button exitBtn = findViewById(R.id.mochaBackBTN);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}