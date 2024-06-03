package com.example.tugas3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import  android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class PersegiPanjangActivity extends AppCompatActivity {
    Button LP, KP, BP, CP;
    EditText Panjang, Lebar;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LP = findViewById(R.id.LPP);
        KP = findViewById(R.id.KPP);
        BP = findViewById(R.id.KemPP);
        CP = findViewById(R.id.BPP);
        Panjang = findViewById(R.id.panjang);
        Lebar = findViewById(R.id.lebar);
        Hasil = findViewById(R.id.HasilPP);


        LP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = Panjang.getText().toString();
                String L = Lebar.getText().toString();
                if(p.isEmpty() && L.isEmpty()){

                }
                else{

                    double Pan = Double.parseDouble(p);
                    double Leb = Double.parseDouble(L);
                    double hitung = Pan * Leb;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        KP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = Panjang.getText().toString();
                String L = Lebar.getText().toString();
                if(p.isEmpty() && L.isEmpty()){

                }
                else {

                    double Pan = Double.parseDouble(p);
                    double Leb = Double.parseDouble(L);
                    double hitung = 2*(Pan + Leb);
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        BP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersegiPanjangActivity.this, IntroActivity.class));
            }
        });
        CP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Panjang.setText("");
                Lebar.setText("");
                Hasil.setText("0");
            }
        });
    }
}