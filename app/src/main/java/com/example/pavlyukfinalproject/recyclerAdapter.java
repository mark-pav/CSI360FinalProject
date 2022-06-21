package com.example.pavlyukfinalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {

    private List<Order> orderList;
    public recyclerAdapter(List<Order> orderList){
        this.orderList = orderList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView description;
        private TextView price;
        private TextView amount;
        private TextView itemTotal;

        public MyViewHolder (final View view){
            super(view);
            img = view.findViewById(R.id.order_image);
            description = view.findViewById(R.id.order_discr);
            price = view.findViewById(R.id.order_price);
            amount = view.findViewById(R.id.order_amount);
            itemTotal = view.findViewById(R.id.order_item_total);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View orderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_items, parent, false);
        return new MyViewHolder(orderView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        holder.img.setImageResource(orderList.get(position).drink.image); //check, really not sure fingers crossed
        holder.description.setText(orderList.get(position).drink.description);

        //String priceString = Double.toString(orderList.get(position).drink.price);
        holder.price.setText("$" + String.format("%.2f", orderList.get(position).drink.price));

        String amountString = Integer.toString(orderList.get(position).getCount());
        holder.amount.setText("X" + amountString);

        double totalForItem = orderList.get(position).drink.price * orderList.get(position).getCount();

        holder.itemTotal.setText("$" + String.format("%.2f", totalForItem));

    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }
}
