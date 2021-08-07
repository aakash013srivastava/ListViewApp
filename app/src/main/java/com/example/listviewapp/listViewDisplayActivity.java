package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listViewDisplayActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_display);
        listView = findViewById(R.id.listView);

        Intent intent = getIntent();
        // Get ArrayList collection passed with intent
        ArrayList<String> arr = (ArrayList<String>)intent.getSerializableExtra("ArrayList");
        // Create Built-in Adapter for ListView
        //ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);

        // Create custom adapter
        customAdapter ca = new customAdapter(this,R.layout.my_layout,arr.toArray(new String[0]));
        listView.setAdapter(ca);

    }
}