package com.example.tugas3;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntroActivity extends AppCompatActivity {
    ConstraintLayout P, PersegiP, Lingkaran, Layang, SG, BK, L, J, F, B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        P = findViewById(R.id.P);
        PersegiP = findViewById(R.id.PersegiPan);
        Lingkaran = findViewById(R.id.LG);
        Layang = findViewById(R.id.Layang);
        SG = findViewById(R.id.SGSS);
        BK = findViewById(R.id.BK);
        L = findViewById(R.id.Lutfi);
        J = findViewById(R.id.jaki);
        F = findViewById(R.id.Farhan);
        B = findViewById(R.id.ben);
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, PersegiActivity.class));
            }
        });
        PersegiP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, PersegiPanjangActivity.class));
            }
        });
        Lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, LingkaranActivity.class));
            }
        });
        Layang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, LayangLayangActivity.class));
            }
        });
        SG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, SegitigaActivity.class));
            }
        });
        BK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, BelahKetupatActivity.class));
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent L = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/lrizaldi_19/?hl=id"));
                startActivity(L);
            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent J = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dzakhano_/?hl=id"));
                startActivity(J);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent F = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/haansarh_/?hl=id"));
                startActivity(F);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bentleyrizkyy_/?hl=id"));
                startActivity(B);
            }
        });





    }



}