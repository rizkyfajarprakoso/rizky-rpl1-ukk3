package com.example.ukk_rizky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menudanjeniskeripik extends AppCompatActivity {
    private Button backmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudanjeniskeripik);
        backmenu=(Button) findViewById(R.id.btnkembali);

        backmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(menudanjeniskeripik.this, com.example.ukk_rizky.homepage.class));
            }
        });
    }
}