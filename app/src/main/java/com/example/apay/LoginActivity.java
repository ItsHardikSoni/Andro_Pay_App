package com.example.apay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText et2Password;
    TextInputEditText et2Email;
    SharedPreferences sp;
    Button btn2lg;
    Button btnNu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et2Password = findViewById(R.id.et2Password);
        et2Email = findViewById(R.id.et2Email);
        btn2lg = findViewById(R.id.btn2Lg);
        btnNu = findViewById(R.id.btnNu);

        sp = getSharedPreferences("Data", 0);

        btn2lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = et2Password.getText().toString();
                String email = et2Email.getText().toString();
                if (email.isBlank()) {
                    et2Email.setError("Enter Email");
                    et2Email.requestFocus();
                } else if (!email.contains("@")) {
                    et2Email.setError("Enter valid email");
                    et2Email.requestFocus();
                } else if (password.isBlank()) {
                    et2Password.setError("Enter password");
                    et2Password.requestFocus();
                }else{
                    String savedPassword = sp.getString("password", "");
                    String savedEmail = sp.getString("email", "");
                    String savedName = sp.getString("name", "");
                    if (email.equals(savedEmail) && password.equals(savedPassword)){
                        Toast.makeText(LoginActivity.this, "Login Success "+savedName, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity3.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this, "Invalid login credentials", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btnNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, com.example.apay.SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}