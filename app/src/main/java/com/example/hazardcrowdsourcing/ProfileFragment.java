package com.example.hazardcrowdsourcing;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hazardcrowdsourcing.Model.PopularFood;
import com.example.hazardcrowdsourcing.adapter.PopularFoodAdapter;

import java.util.ArrayList;
import java.util.List;


public class ProfileFragment extends Fragment implements  AdapterView.OnItemClickListener{

    Dialog myDialog;
    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
               View rootView =  inflater.inflate(R.layout.fragment_profile, container, false);
        setHasOptionsMenu(true);//Make sure you have this line of code.
        myDialog = new Dialog(getContext());


        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Muhammad Haikal Bin Muhammad Johan","2019322189","RCS2405C","CS240","FSKM", R.drawable.haikal));
        popularFoodList.add(new PopularFood("Fikri Nazeef Bin Jasni","2019311899","RCS2405B","CS240","FSKM", R.drawable.fikri));
        popularFoodList.add(new PopularFood("Akmal Al Aqid Bin Mohd Azudin","2019311837","RCS2405C","CS240","FSKM",R.drawable.aqid1));
        popularFoodList.add(new PopularFood("Bishrun Bin Abdullah","2019311911","RCS2405C","CS240","FSKM", R.drawable.bish));
        popularFoodList.add(new PopularFood("Abdul Muntaqim Bin Mohd Muhayeddin","2019564059","RCS2405C","CS240","FSKM",R.drawable.taqin));
        popularFoodList.add(new PopularFood("Muhammad Islah Hakimi Bin Mohd Idris","2019361521","RCS2405C","CS240","FSKM", R.drawable.islah));


        popularRecycler = rootView.findViewById(R.id.popular_recycler);

        setPopularRecycler(popularFoodList);
        ImageView url = (ImageView) rootView.findViewById(R.id.github);


        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                URL("https://github.com/fikrinazeef/projectict602");
            }
        });

        return rootView;
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(getContext(), popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    public void showDialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
        alertDialog.setTitle("Copyright");
        alertDialog.setMessage("Hazard Crowsourcing Mobile Application ©2021 Hazard Crowsourcing, Inc. All Right Reserved ");
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        // onClick button code here
                        dialog.dismiss();// use dismiss to cancel alert dialog
                    }
                });
        alertDialog.show();
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.copyright, menu) ;
//    }

    private void URL(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.copy:
//                showDialog();
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//



}