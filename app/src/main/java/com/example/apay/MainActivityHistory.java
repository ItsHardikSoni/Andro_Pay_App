package com.example.apay;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_history);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        todo_history item1 = new todo_history("Rs. 220", "Reliance", "Transection ID: 787983471");
        todo_history item2 = new todo_history("Rs. 200", "V Mart", "Transection ID: 9897884848");
        todo_history item3 = new todo_history("Rs. 500", "Everyday Mart", "Transection ID: 988483683");
        todo_history item4 = new todo_history("Rs. 550", "Vishal Mega Mart", "Transection ID: 793798974");
        todo_history item5 = new todo_history("Rs. 150", "Easy Day Mart", "Transection ID: 8785674875");
        todo_history item6 = new todo_history("Rs. 650", "Day to Day Mart", "Transection ID: 9897594896");

        List<todo_history> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        RecyclerHistoryAdaptor recyclerHistoryAdapter = new RecyclerHistoryAdaptor(
                this,
                itemList, R.layout.it_todo_history
        );

        RecyclerView recyclerView = findViewById(R.id.rcViewHistory);

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivityHistory.this, LinearLayoutManager.VERTICAL,
                false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerHistoryAdapter);
    }
}