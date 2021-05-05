package com.example.exercise2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewDataTeman extends AppCompatActivity {

    TextView tvNama, tvTelpon;

    String nama, telpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data_teman);

        tvNama = findViewById(R.id.tvNamaKontak);
        tvTelpon = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        nama = bundle.getString("nama");
        telpon = bundle.getString("telpon");

        tvNama.setText(nama);
        tvTelpon.setText(telpon);
    }
}