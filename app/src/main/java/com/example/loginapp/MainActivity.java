package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginapp.MainActivity2;


public class MainActivity extends AppCompatActivity {

    private Button btnlogin;
    private Button btnpencet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btn_login);
        btnpencet = findViewById(R.id.btn_pencet);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(pindah);
            }

        });

        btnpencet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ganti = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(ganti);
            }
        });


    }
}