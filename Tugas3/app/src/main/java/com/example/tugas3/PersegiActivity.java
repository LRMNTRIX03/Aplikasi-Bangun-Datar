package com.example.tugas3;

import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class PersegiActivity extends AppCompatActivity {
    Button LP,KP,BP,CP;
    TextView HP;
    EditText Sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LP = findViewById(R.id.LP);
        BP = findViewById(R.id.KP);
        KP = findViewById(R.id.KelP);
        CP = findViewById(R.id.BP);
        HP = findViewById(R.id.HasilP);
        Sisi = findViewById(R.id.sisi);

        LP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Sisi.getText().toString();
                if(s.isEmpty()){

                }
                else{
                    double P = Double.parseDouble(s);
                    double hitung = P*P;
                    HP.setText(String.valueOf(hitung));
                }

            }
        });
        KP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String S = Sisi.getText().toString();
                if(S.isEmpty()){

                }
                else {
                    double x = Double.parseDouble(S);
                    double hitung = 4*x;
                    HP.setText(String.valueOf(hitung));
                }

            }
        });
        CP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sisi.setText("");
                HP.setText("");
            }
        });
        BP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersegiActivity.this, IntroActivity.class));
            }
        });

    }
}