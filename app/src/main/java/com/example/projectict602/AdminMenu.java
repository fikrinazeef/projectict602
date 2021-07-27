package com.example.projectict602;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMenu extends AppCompatActivity {

    Button adds,views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        adds = (Button) findViewById(R.id.add);
        views = (Button) findViewById(R.id.view);

        adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Administrator.class);
                startActivity(intent);
            }
        });
        views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), AdminView.class);
                startActivity(intent);
            }
        });

    }
}