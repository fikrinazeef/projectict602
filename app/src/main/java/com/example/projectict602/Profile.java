package com.example.projectict602;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    ImageView fikri,taqim,aqid,bish,haikal,git;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fikri = findViewById(R.id.nazeef);
        taqim = findViewById(R.id.gemok);
        aqid = findViewById(R.id.qid);
        bish = findViewById(R.id.bishrun);
        haikal = findViewById(R.id.haokal);
        git = findViewById(R.id.github);

        dialog= new Dialog(this);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/fikrinazeef/projectict602"));
                startActivity(intent);
            }
        });
        fikri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.view_fikri);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageView= dialog.findViewById(R.id.nazeef);
                Button ok=dialog.findViewById(R.id.okayfikri);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //      Toast.makeText(Profile.this,"Thank You",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
        taqim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.view_taqim);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageView= dialog.findViewById(R.id.gemok);
                Button ok=dialog.findViewById(R.id.okaytaqim);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //      Toast.makeText(Profile.this,"Thank You",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
        aqid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.view_aqid);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageView= dialog.findViewById(R.id.qid);
                Button ok=dialog.findViewById(R.id.okayaqid);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //      Toast.makeText(Profile.this,"Thank You",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
        bish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.view_bish);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageView= dialog.findViewById(R.id.bishrun);
                Button ok=dialog.findViewById(R.id.okaybish);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //      Toast.makeText(Profile.this,"Thank You",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
        haikal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.view_haikal);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageView= dialog.findViewById(R.id.haokal);
                Button ok=dialog.findViewById(R.id.okayhaikal);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //      Toast.makeText(Profile.this,"Thank You",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}