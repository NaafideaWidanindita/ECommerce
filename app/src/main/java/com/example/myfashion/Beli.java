package com.example.myfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beli extends AppCompatActivity {

    private EditText txtBarang,txtHargaBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);

        EditText txtJumlah,txtTotal,txtBayar,txtKembalian;
        Button btnHitungTotal,btnHitungKembalian,btnCheckout,btnKembali;

        txtBarang = findViewById(R.id.txtBarang);
        txtHargaBarang = findViewById(R.id.txtHargaBarang);
        txtJumlah =findViewById(R.id.txtJumlah);
        txtTotal = findViewById(R.id.txtTotal);
        txtBayar = findViewById(R.id.txtBayar);
        txtKembalian = findViewById(R.id.txtKembalian);

        btnHitungTotal= findViewById(R.id.btnHitungTotal);
        btnHitungKembalian= findViewById(R.id.btnHitungKembalian);
        btnCheckout = findViewById(R.id.btnCheckout);
        btnKembali =findViewById(R.id.btnKembali);

        Intent intent = getIntent();
        if (intent != null) {

            String nama_barang = intent.getStringExtra("nama_barang");
            double harga_barang = intent.getDoubleExtra("harga_barang", 0.0);

            txtBarang.setText(""+nama_barang);
            txtHargaBarang.setText(""+harga_barang);
        }

        btnHitungTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jumlah,harga_barang,total;

                jumlah = Double.parseDouble(txtJumlah.getText().toString());
                harga_barang =Double.parseDouble(txtHargaBarang.getText().toString());

                total=jumlah*harga_barang;
                txtTotal.setText(""+total);
            }
        });
        btnHitungKembalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total,bayar,kembalian;

                total = Double.parseDouble(txtTotal.getText().toString());
                bayar =Double.parseDouble(txtBayar.getText().toString());

                kembalian=bayar-total;
                txtKembalian.setText(""+kembalian);
            }
        });
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total;

                total=Double.parseDouble(txtTotal.getText().toString());

                Intent intent = new Intent(Beli.this, Checkout.class);

                intent.putExtra("total", total);

                startActivity(intent);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Beli.this,Belanja.class);
                startActivity(intent);
            }
        });

    }
}