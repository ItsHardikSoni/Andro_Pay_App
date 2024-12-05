package com.example.apay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {


    TextInputEditText etName;
    TextInputEditText etEmail;
    TextInputEditText etPassword;
    Button btnSp;
    Button btnLg;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSp = findViewById(R.id.btnSp);
        btnLg = findViewById(R.id.btnLg);

        sp = getSharedPreferences("Data", 0);



        btnSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if(name.isBlank()) {
                    etName.setError("Enter Name");
                    etName.requestFocus();
                } else if (email.isBlank()) {
                    etEmail.setError("Enter Email");
                    etEmail.requestFocus();
                } else if (!email.contains("@")) {
                    etEmail.setError("Enter valid email");
                    etEmail.requestFocus();
                }else if (password.isBlank()) {
                    etPassword.setError("Enter Password");
                    etPassword.requestFocus();
                }else {

                    sp.edit()
                            .putString("name", name)
                            .putString("email", email)
                            .putString("password", password)
                            .apply();

                    Toast.makeText(SignUpActivity.this, "Sign Up success ", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}