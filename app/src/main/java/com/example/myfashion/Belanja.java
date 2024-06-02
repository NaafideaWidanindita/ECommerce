package com.example.myfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class Belanja extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belanja);

        ImageButton btnWanita, btnPria;
        Button btnKembali, btnBeliFW1, btnBeliFW2, btnBeliFP1, btnBeliFP2;
        TextView txtFashionWanita, txtFashionPria;
        TextView txtFW1, txtFW2, txtFP1, txtFP2;
        TextView txtHargaFW1, txtHargaFW2, txtHargaFP1, txtHargaFP2;

        final ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        btnWanita = (ImageButton) findViewById(R.id.btnWanita);
        btnPria = (ImageButton) findViewById(R.id.btnPria);

        btnKembali = (Button) findViewById(R.id.btnKembali);
        btnBeliFW1 = (Button) findViewById(R.id.btnBeliFW1);
        btnBeliFW2 = (Button) findViewById(R.id.btnBeliFW2);
        btnBeliFP1 = (Button) findViewById(R.id.btnBeliFP1);
        btnBeliFP2 = (Button) findViewById(R.id.btnBeliFP2);

        txtFashionWanita = (TextView) findViewById(R.id.txtFashionWanita);
        txtFashionPria = (TextView) findViewById(R.id.txtFashionPria);

        txtFW1 = (TextView) findViewById(R.id.txtFW1);
        txtFW2 = (TextView) findViewById(R.id.txtFW2);
        txtFP1 = (TextView) findViewById(R.id.txtFP1);
        txtFP2 = (TextView) findViewById(R.id.txtFP2);

        txtHargaFW1 = (TextView) findViewById(R.id.txtHargaFW1);
        txtHargaFW2 = (TextView) findViewById(R.id.txtHargaFW2);
        txtHargaFP1 = (TextView) findViewById(R.id.txtHargaFP1);
        txtHargaFP2 = (TextView) findViewById(R.id.txtHargaFP2);

        btnWanita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, txtFashionWanita.getTop());
                    }
                });
            }
        });
        btnPria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, txtFashionPria.getTop());
                    }
                });
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Belanja.this, Menu.class);
                startActivity(intent);
            }
        });

        btnBeliFW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_barang;
                double harga_barang;
                nama_barang = txtFW1.getText().toString().trim();
                harga_barang = Double.parseDouble(txtHargaFW1.getText().toString());

                Intent intent = new Intent(Belanja.this, Beli.class);

                intent.putExtra("nama_barang", nama_barang);
                intent.putExtra("harga_barang", harga_barang);

                startActivity(intent);
            }
        });

        btnBeliFW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_barang;
                double harga_barang;
                nama_barang = txtFW2.getText().toString().trim();
                harga_barang = Double.parseDouble(txtHargaFW2.getText().toString());

                Intent intent = new Intent(Belanja.this, Beli.class);

                intent.putExtra("nama_barang", nama_barang);
                intent.putExtra("harga_barang", harga_barang);

                startActivity(intent);
            }
        });

        btnBeliFP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_barang;
                double harga_barang;
                nama_barang = txtFP1.getText().toString().trim();
                harga_barang = Double.parseDouble(txtHargaFP1.getText().toString());

                Intent intent = new Intent(Belanja.this, Beli.class);

                intent.putExtra("nama_barang", nama_barang);
                intent.putExtra("harga_barang", harga_barang);

                startActivity(intent);
            }
        });

        btnBeliFP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_barang;
                double harga_barang;
                nama_barang = txtFP2.getText().toString().trim();
                harga_barang = Double.parseDouble(txtHargaFP2.getText().toString());

                Intent intent = new Intent(Belanja.this, Beli.class);

                intent.putExtra("nama_barang", nama_barang);
                intent.putExtra("harga_barang", harga_barang);

                startActivity(intent);
            }
        });
    }
}