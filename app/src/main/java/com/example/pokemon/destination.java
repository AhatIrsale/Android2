package com.example.pokemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class destination extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.destination);

        TextView v= findViewById(R.id.txtv1);
        ImageView im = findViewById(R.id.img1);

        v.bringToFront();

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(destination.this,MainActivity.class);
                startActivity(in);
            }
        });

        String msg=getIntent().getStringExtra("var");
        v.setText(msg);

    }
}
