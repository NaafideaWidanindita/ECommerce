package com.example.myfashion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageButton btnTelpon1,btnTelpon2,btnTelpon3;
        TextView txtNo1,txtNo2,txtNo3;

        btnTelpon1=(ImageButton) findViewById(R.id.btnTelpon1);
        btnTelpon2=(ImageButton) findViewById(R.id.btnTelpon2);
        btnTelpon3=(ImageButton) findViewById(R.id.btnTelpon3);
        txtNo1=(TextView) findViewById(R.id.txtNo1);
        txtNo2=(TextView) findViewById(R.id.txtNo2);
        txtNo3=(TextView) findViewById(R.id.txtNo3);

        btnTelpon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telpon;
                telpon = "tel:"+txtNo1.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(telpon)));
            }
        });
        btnTelpon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telpon;
                telpon = "tel:"+txtNo2.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(telpon)));
            }
        });
        btnTelpon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telpon;
                telpon = "tel:"+txtNo3.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(telpon)));
            }
        });
    }
}