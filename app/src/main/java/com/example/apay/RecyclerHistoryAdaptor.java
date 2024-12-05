package com.example.apay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerHistoryAdaptor extends RecyclerView.Adapter<RecyclerHistoryAdaptor.MyViewHolder>  {

    Context context;
    List<todo_history> itemList;
    int resource;

    // Step 7 - Create constructor
    public RecyclerHistoryAdaptor(Context context, List<todo_history> itemList, int resource) {
        // Step 8 - Assign values to properties
        this.context = context;
        this.itemList = itemList;
        this.resource = resource;
    }

    // Step 9 - Override Methods

    @NonNull
    @Override
    public RecyclerHistoryAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Step 10 - Inflate Layout
        View view = LayoutInflater.from(context).inflate(resource, parent, false);
        return new RecyclerHistoryAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHistoryAdaptor.MyViewHolder holder, int position) {
        // Step 11 - Get Data
        todo_history item = itemList.get(position);

        // Step 12 - Set Values
        holder.tvProductId.setText(item.productId);
        holder.tvProductQuantity.setText(item.productQuantity);
        holder.tvTotalPrice.setText(item.totalPrice);
    }

    @Override
    public int getItemCount() {
        // Step 13 - Return list size
        return itemList.size();
    }

    // Step 2 - Declare ViewHolder Class
    class MyViewHolder extends RecyclerView.ViewHolder {

        // Step 3 - Declare Views defined in layout
        TextView tvProductId;
        TextView tvProductQuantity;
        TextView tvTotalPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // Step 4 - Find views from layout
            tvProductId = itemView.findViewById(R.id.tvProductId);
            tvProductQuantity = itemView.findViewById(R.id.tvProductQuantity);
            tvTotalPrice = itemView.findViewById(R.id.tvTotalPrice);
        }
    }

}
