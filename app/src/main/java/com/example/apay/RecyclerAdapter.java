package com.example.apay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    // Step 6 - Declare Properties
    Context context;
    List<todo_item> itemList;
    int resource;

    // Step 7 - Create constructor
    public RecyclerAdapter(Context context, List<todo_item> itemList, int resource) {
        // Step 8 - Assign values to properties
        this.context = context;
        this.itemList = itemList;
        this.resource = resource;
    }

    // Step 9 - Override Methods

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Step 10 - Inflate Layout
        View view = LayoutInflater.from(context).inflate(resource, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Step 11 - Get Data
        todo_item item = itemList.get(position);

        // Step 12 - Set Values
        holder.tvProductTitle.setText(item.productTitle);
        holder.tvProductQuantity.setText(item.productQuantity);
        holder.tvProductPrice.setText(item.productPrice);
    }

    @Override
    public int getItemCount() {
        // Step 13 - Return list size
        return itemList.size();
    }

    // Step 2 - Declare ViewHolder Class
    class MyViewHolder extends RecyclerView.ViewHolder {

        // Step 3 - Declare Views defined in layout
        TextView tvProductTitle;
        TextView tvProductQuantity;
        TextView tvProductPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Step 4 - Find views from layout
            tvProductTitle = itemView.findViewById(R.id.tvProductTitle);
            tvProductQuantity = itemView.findViewById(R.id.tvProductQuantity);
            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
        }
    }
}
