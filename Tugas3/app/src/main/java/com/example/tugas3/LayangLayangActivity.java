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
import android.widget.Toast;

public class LayangLayangActivity extends AppCompatActivity {
    Button LLL, KLL, CLL, BLL;
    EditText Di1, Di2, A, B, C, D;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layang_layang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LLL = findViewById(R.id.LLL);   A = findViewById(R.id.A);
        KLL = findViewById(R.id.KLL);   B = findViewById(R.id.B);
        CLL = findViewById(R.id.BLL);   C = findViewById(R.id.C);
        BLL = findViewById(R.id.KemLL); D = findViewById(R.id.D);
        Di1 = findViewById(R.id.D1_LL);
        Di2 = findViewById(R.id.D2_LL);
        Hasil = findViewById(R.id.HasilLL);

        LLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String D1 = Di1.getText().toString();
                String D2 = Di2.getText().toString();
                if(D1.isEmpty() && D2.isEmpty()){

                }
                else{
                    double Dia1 = Double.parseDouble(D1);
                    double Dia2 = Double.parseDouble(D2);
                    double hitung = Dia1*Dia2/2;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        KLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String D1 = Di1.getText().toString();
                String D2 = Di2.getText().toString();
                String A1 = A.getText().toString();
                String B1 = B.getText().toString();
                String C1 = C.getText().toString();
                String DD = D.getText().toString();
                if(A1.isEmpty() && B1.isEmpty() && C1.isEmpty() && DD.isEmpty()){

                }
                else{
                    double A2 = Double.parseDouble(A1);
                    double B2 = Double.parseDouble(B1);
                    double C2 = Double.parseDouble(C1);
                    double DDD = Double.parseDouble(DD);
                    double hitung = A2+B2+C2+DDD;
                    Hasil.setText(String.valueOf(hitung));
                }
            }
        });
        BLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LayangLayangActivity.this, IntroActivity.class));
            }
        });
        CLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Di1.setText("");
                Di2.setText("");
                A.setText("");
                B.setText("");
                C.setText("");
                D.setText("");
                Hasil.setText("0");
            }
        });

    }
}