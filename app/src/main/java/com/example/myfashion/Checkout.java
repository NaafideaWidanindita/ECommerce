package com.example.myfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {

    private TextView txtTotalHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Button btnKembali;

        txtTotalHarga = findViewById(R.id.txtTotalHarga);
        btnKembali =findViewById(R.id.btnKembali);

        Intent intent = getIntent();
        if (intent != null) {
            double total = intent.getDoubleExtra("total", 0.0);

            txtTotalHarga.setText(""+total);
        }
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Checkout.this,Belanja.class);
                startActivity(intent);
            }
        });
    }
}