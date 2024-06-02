package com.example.myfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btnBelanja=(Button) findViewById(R.id.btnBelanja);
        Button btnContact=(Button) findViewById(R.id.btnContact);
        Button btnKeluar=(Button) findViewById(R.id.btnKeluar);

        btnBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu.this,Belanja.class);
                startActivity(intent);
            }
        });
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu.this,Contact.class);
                startActivity(intent);
            }
        });
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}