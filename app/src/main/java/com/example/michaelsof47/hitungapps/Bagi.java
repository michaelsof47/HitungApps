package com.example.michaelsof47.hitungapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bagi extends AppCompatActivity implements View.OnClickListener{

    EditText txtAngka1, txtAngka2;
    TextView txtHasil;
    Button btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);

        txtAngka1 = (EditText) findViewById(R.id.angka1);
        txtAngka2 = (EditText) findViewById(R.id.angka2);
        txtHasil = (TextView) findViewById(R.id.hasil);

        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() ==  R.id.btnBagi)
        {
            double value = 0;

            String value1 = txtAngka1.getText().toString().trim();
            String value2 = txtAngka2.getText().toString().trim();

            if(value1.equals("") && value2.equals(""))
            {
                Toast.makeText(this, "You Must Fill a Value First", Toast.LENGTH_SHORT).show();
            }
            else
            {
                double nilai1 = Double.parseDouble(value1);
                double nilai2 = Double.parseDouble(value2);

                value = nilai1 / nilai2;

                String hasil = String.valueOf(value);

                txtHasil.setText(hasil);

            }

        }
    }
}
