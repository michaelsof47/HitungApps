package com.example.michaelsof47.hitungapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    Button btnJumlah, btnKurang, btnKali, btnBagi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnJumlah = (Button) findViewById(R.id.jumlah);
        btnJumlah.setOnClickListener(this);

        btnKurang = (Button) findViewById(R.id.kurang);
        btnKurang.setOnClickListener(this);

        btnKali = (Button) findViewById(R.id.kali);
        btnKali.setOnClickListener(this);

        btnBagi = (Button) findViewById(R.id.bagi);
        btnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.jumlah:
                Intent jumlah = new Intent(this, Jumlah.class);
                startActivity(jumlah);
                break;
            case R.id.kurang:
                Intent kurang = new Intent(this, Kurang.class);
                startActivity(kurang);
                break;
            case R.id.kali:
                Intent kali = new Intent(this, Kali.class);
                startActivity(kali);
                break;
            case R.id.bagi:
                Intent bagi = new Intent(this, Bagi.class);
                startActivity(bagi);
        }
    }
}
