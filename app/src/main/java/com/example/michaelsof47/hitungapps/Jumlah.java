package com.example.michaelsof47.hitungapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Jumlah extends AppCompatActivity implements View.OnClickListener {

    EditText txtAngka1, txtAngka2;
    TextView txtHasil;
    Button btnJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah);

        txtAngka1 = (EditText) findViewById(R.id.angka1);
        txtAngka2 = (EditText) findViewById(R.id.angka2);
        txtHasil = (TextView) findViewById(R.id.hasil);

        btnJumlah = (Button) findViewById(R.id.btnJumlah);
        btnJumlah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() ==  R.id.btnJumlah)
        {
            int value = 0;

            String value1 = txtAngka1.getText().toString().trim();
            String value2 = txtAngka2.getText().toString().trim();

            if(value1.equals("") && value2.equals(""))
            {
                Toast.makeText(this, "You Must Fill a Value First", Toast.LENGTH_SHORT).show();
            }
            else
            {
                int nilai1 = Integer.parseInt(value1);
                int nilai2 = Integer.parseInt(value2);

                value = nilai1 + nilai2;

                String hasil = String.valueOf(value);

                txtHasil.setText(hasil);

            }

        }

    }
}
