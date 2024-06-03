package com.example.tugas3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class BelahKetupatActivity extends AppCompatActivity {
    Button LBK, KBK, BBK, CBK;
    EditText D1, D2, Sisi;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_belah_ketupat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LBK = findViewById(R.id.LBK);
        KBK = findViewById(R.id.KBK);
        D1 = findViewById(R.id.D1);
        D2 = findViewById(R.id.D2);
        Sisi = findViewById(R.id.SBK);
        CBK = findViewById(R.id.BBK);
        BBK = findViewById(R.id.KemBK);
        Hasil = findViewById(R.id.HasilBK);

        LBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = D1.getText().toString();
                String B = D2.getText().toString();
                if(A.isEmpty() && B.isEmpty()){

                }
                else{
                    double D1 = Double.parseDouble(A);
                    double D2 = Double.parseDouble(B);
                    double hitung = D1*D2/2;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        KBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = D1.getText().toString();
                String B = D2.getText().toString();
                String C = Sisi.getText().toString();
                if(A.isEmpty() && B.isEmpty() && C.isEmpty()){

                }
                else{
                    double sisi = Double.parseDouble(C);
                    double hitung = 4*sisi;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        CBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hasil.setText("0");
                D1.setText("");
                D2.setText("");
                Sisi.setText("");
            }
        });
        BBK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BelahKetupatActivity.this, IntroActivity.class));
            }
        });
    }
}