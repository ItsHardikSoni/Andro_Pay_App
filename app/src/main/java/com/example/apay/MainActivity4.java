package com.example.apay;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnPay = findViewById(R.id.btnPay);

        todo_item item1 = new todo_item("Good Day Biscuts", "3", "Rs. 30");
        todo_item item2 = new todo_item("Banana", "12", "Rs. 70");
        todo_item item3 = new todo_item("Amul Milk", "2", "Rs. 60");
        todo_item item4 = new todo_item("Kurkure", "2", "Rs. 20");
        todo_item item5 = new todo_item("Lays", "2", "Rs. 20");
        todo_item item6 = new todo_item("Chocos", "2", "Rs. 20");




        List<todo_item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);


        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(
                this,
                itemList, R.layout.it_todo_item
        );

        RecyclerView recyclerView = findViewById(R.id.rcView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity4.this, LinearLayoutManager.VERTICAL,
                false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity4.this, "Payment Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}