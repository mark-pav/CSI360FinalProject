package com.example.pavlyukfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AmericanoActivity extends AppCompatActivity {

    CoffeeDrink classicAmericano = new CoffeeDrink("americano", R.drawable.americano, "Classic Americano", 4.25);
    CoffeeDrink chocolateAmericano = new CoffeeDrink("americano", R.drawable.chocolate_americano, "Choco Americano", 4.55);
    CoffeeDrink vanillaAmericano = new CoffeeDrink("americano", R.drawable.vanilla_americano, "Vanilla Americano", 4.75);
    CoffeeDrink caramelAmericano = new CoffeeDrink("americano", R.drawable.caramel_americano, "Caramel Americano", 4.75);
    CoffeeDrink cinamonAmericano = new CoffeeDrink("americano", R.drawable.cinamon_americano, "Cinnamon Americano", 4.75);

    int countToAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);

        //Everything for classic americano
        ImageView img1 = findViewById(R.id.americano_image1);
        img1.setImageResource(classicAmericano.image);
        TextView txt1 = findViewById(R.id.americano_discr1);
        txt1.setText(classicAmericano.description);
        TextView price1 = findViewById(R.id.americano_price1);
        price1.setText("$" + Double.toString(classicAmericano.price));

        Button btn1 = findViewById(R.id.americanoOrderBtn1);
        EditText qty1 = findViewById(R.id.americano_qty1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty1.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(classicAmericano, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Chocolate Americano
        ImageView img2 = findViewById(R.id.americano_image2);
        img2.setImageResource(chocolateAmericano.image);
        TextView txt2 = findViewById(R.id.americano_discr2);
        txt2.setText(chocolateAmericano.description);
        TextView price2 = findViewById(R.id.americano_price2);
        price2.setText("$" + Double.toString(chocolateAmericano.price));

        Button btn2 = findViewById(R.id.americanoOrderBtn2);
        EditText qty2 = findViewById(R.id.americano_qty2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty2.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(chocolateAmericano, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        //Everything for Vanilla Americano
        ImageView img3 = findViewById(R.id.americano_image3);
        img3.setImageResource(vanillaAmericano.image);
        TextView txt3 = findViewById(R.id.americano_discr3);
        txt3.setText(vanillaAmericano.description);
        TextView price3 = findViewById(R.id.americano_price3);
        price3.setText("$" + Double.toString(vanillaAmericano.price));

        Button btn3 = findViewById(R.id.americanoOrderBtn3);
        EditText qty3 = findViewById(R.id.americano_qty3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty3.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(vanillaAmericano, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for Caramel Americano
        ImageView img4 = findViewById(R.id.americano_image4);
        img4.setImageResource(caramelAmericano.image);
        TextView txt4 = findViewById(R.id.americano_discr4);
        txt4.setText(caramelAmericano.description);
        TextView price4 = findViewById(R.id.americano_price4);
        price4.setText("$" + Double.toString(caramelAmericano.price));

        Button btn4 = findViewById(R.id.americanoOrderBtn4);
        EditText qty4 = findViewById(R.id.americano_qty4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty4.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(caramelAmericano, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




        //Everything for cinamon americano
        ImageView img5 = findViewById(R.id.americano_image5);
        img5.setImageResource(cinamonAmericano.image);
        TextView txt5 = findViewById(R.id.americano_discr5);
        txt5.setText(cinamonAmericano.description);
        TextView price5 = findViewById(R.id.americano_price5);
        price5.setText("$" + Double.toString(cinamonAmericano.price));

        Button btn5 = findViewById(R.id.americanoOrderBtn5);
        EditText qty5 = findViewById(R.id.americano_qty5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countToAddToCart = Integer.parseInt(qty5.getText().toString());
                MainActivity.drinkCountTotal += countToAddToCart;
                MainActivity.currentOrder.add(new Order(cinamonAmericano, countToAddToCart));
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button exitBtn = findViewById(R.id.americanoBackBTN);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}