package com.example.hazardcrowdsourcing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements  View.OnClickListener  {

    CardView admin,user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        admin = (CardView) findViewById(R.id.cardView);
        user = (CardView) findViewById(R.id.cardView1);

        admin.setOnClickListener(this);
        user.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.cardView :
                Intent myIntent = new Intent(MenuActivity.this, AdminMenu.class);
                startActivity(myIntent);
                break;
            case R.id.cardView1 :
                Intent myIntent1 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(myIntent1);
                break;



        }
    }
}