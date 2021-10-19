package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Button btn_masuk;
    private ImageButton btn_login;
    private EditText emailbang;
    private EditText pwBang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn_masuk = findViewById(R.id.btn_masuk);
        btn_login = findViewById(R.id.btn_login);
        emailbang = findViewById(R.id.emailbang);
        pwBang = findViewById(R.id.pwBang);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ganti = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(ganti);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emailbang.getText().toString().equals("azulfanur") && pwBang.getText().toString().equals("root")){
                    //Correct
                    Toast.makeText(MainActivity3.this,"Login Succses",Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(MainActivity3.this, MainActivity5.class);
                    startActivity(login);
                } else if (emailbang.getText().toString().equals("") && pwBang.getText().toString().equals("")){
                    //Error
                    Toast.makeText(MainActivity3.this,"Enter Username & Password",Toast.LENGTH_LONG).show();
                } else if (emailbang.getText().toString().equals("azulfanur") && pwBang.getText().toString().equals("")) {
                    //Username Only
                    Toast.makeText(MainActivity3.this,"Enter your Password",Toast.LENGTH_LONG).show();
                } else if (emailbang.getText().toString().equals("") && pwBang.getText().toString().equals("root")) {
                    //Password Only
                    Toast.makeText(MainActivity3.this,"Enter your Username",Toast.LENGTH_SHORT).show();
                } else {
                    //Incorrect
                    Toast.makeText(MainActivity3.this,"Password & Username Incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}