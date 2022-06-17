package com.example.pavlyukfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    List<Order> totalOrder = MainActivity.currentOrder;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        double totalToPay = 0;
        for (int i=0; i<totalOrder.size();i++){
            totalToPay+=(totalOrder.get(i).drink.price * totalOrder.get(i).count);
        }

        TextView totalToPayTV = findViewById(R.id.orderTotalToPay);
        totalToPayTV.setText("Order Total: $" + String.format("%.2f", totalToPay));


        recyclerView = findViewById(R.id.orderRecyclerView);

        setAdapter();
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(totalOrder);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}