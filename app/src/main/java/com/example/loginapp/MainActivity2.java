package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText texttinggi;
    private EditText textalas;
    private Button hitungcuy;
    private TextView hasilcuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texttinggi = findViewById(R.id.texttinggi);
        textalas = findViewById(R.id.textalas);
        hitungcuy = findViewById(R.id.hitungcuy);
        hasilcuy = findViewById(R.id.hasilcuy);

        hitungcuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(texttinggi.getText().toString());
                int b = Integer.parseInt(textalas.getText().toString());
                float hasil = a*b/2;

                hasilcuy.setText("Luas segitiga adalah = " + String.valueOf(hasil) + ("cm"));

            }
        });

    }
}