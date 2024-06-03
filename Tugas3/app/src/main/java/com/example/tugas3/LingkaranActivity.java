package com.example.tugas3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class LingkaranActivity extends AppCompatActivity {
    Button LL, KembL, BL, Klin;
    EditText Jr;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lingkaran);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LL = findViewById(R.id.LJ);
        Klin = findViewById(R.id.KJ);
        KembL = findViewById(R.id.KemL);
        BL = findViewById(R.id.BL);
        Jr = findViewById(R.id.jj);
        Hasil = findViewById(R.id.HasilL);

        LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String J = Jr.getText().toString();

                if(J.isEmpty()){

                }
                else{
                    double r = Double.parseDouble(J);
                    double hitung = 3.14*r*r;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        Klin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String J = Jr.getText().toString();

                if(J.isEmpty()){

                }
                else{
                    double r = Double.parseDouble(J);
                    double hitung = 2*3.14*r;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        KembL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LingkaranActivity.this, IntroActivity.class));
            }
        });
        BL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jr.setText("");
                Hasil.setText("0");
            }
        });

    }
}