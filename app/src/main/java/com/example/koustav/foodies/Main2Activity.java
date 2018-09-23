package com.example.koustav.foodies;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.AdapterView.*;

public class Main2Activity extends AppCompatActivity {
    Spinner spn;
    String []ar={"Select from here:","Veg","NonVeg","Dessert"};
    ArrayAdapter adpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spn = findViewById(R.id.spn);
        adpt = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, ar);
        spn.setAdapter(adpt);
        spn.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spn.getSelectedItem().toString().equals("Select from here:")) {
                    Toast.makeText(Main2Activity.this, "Select from spinners", Toast.LENGTH_SHORT).show();
                } else if (spn.getSelectedItem().toString().equals("Veg")) {
                    startActivity(new Intent(Main2Activity.this,VegList.class));
                    Toast.makeText(Main2Activity.this, "Showing Veg Recipes", Toast.LENGTH_SHORT).show();
                } else if (spn.getSelectedItem().toString().equals("NonVeg")) {
                    startActivity(new Intent(Main2Activity.this,NonVegList.class));
                    Toast.makeText(Main2Activity.this, "Showing Non Veg Recipes", Toast.LENGTH_SHORT).show();
                } else
                {
                    startActivity(new Intent(Main2Activity.this,DessertList.class));
                    Toast.makeText(Main2Activity.this, "Showing Dessert Recipes ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.toString().equals("Logout")){
            startActivity(new Intent(Main2Activity.this,MainActivity.class));
            this.finish();
        }
        else{
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}


