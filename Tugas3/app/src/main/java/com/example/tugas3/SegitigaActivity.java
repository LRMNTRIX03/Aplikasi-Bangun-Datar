package com.example.tugas3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class SegitigaActivity extends AppCompatActivity {
    Button LS, KS, BS, CS;
    EditText A, T;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LS = findViewById(R.id.LS);
        KS = findViewById(R.id.KS);
        BS = findViewById(R.id.KemS);
        CS = findViewById(R.id.BS);
        A = findViewById(R.id.alas);
        T = findViewById(R.id.tinggi);
        Hasil = findViewById(R.id.HasiS);

        LS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = A.getText().toString();
                String b = T.getText().toString();
                if(a.isEmpty() && b.isEmpty()){

                }
                else{
                    double alas = Double.parseDouble(a);
                    double tinggi = Double.parseDouble(b);
                    double hitung = (alas*tinggi)/2;
                    Hasil.setText(String.valueOf(hitung));
                }

            }
        });
        KS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = A.getText().toString();
                String b = T.getText().toString();
                if(a.isEmpty() && b.isEmpty()){

                }
                else{
                    double sisi = Double.parseDouble(a);
                    double hitung = sisi+sisi+sisi;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SegitigaActivity.this, IntroActivity.class));
            }
        });
        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hasil.setText("0");
                A.setText("");
                T.setText("");
            }
        });
    }
}