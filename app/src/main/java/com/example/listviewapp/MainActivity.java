package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    EditText listItem;
    Button addButton,viewList;
    TextView displayListItem;
    ArrayList<String> items = new ArrayList<>();
    String output = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItem = findViewById(R.id.editTextItem);
        addButton = findViewById(R.id.addListItemButton);
        viewList = findViewById(R.id.viewList);
        displayListItem = findViewById(R.id.displayListItem);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemDesc = listItem.getText().toString();

                if(itemDesc.length()>0){
                    output += itemDesc+"\n";
                    items.add(itemDesc);
                    displayListItem.setText(output);
                }
            }
        });

        viewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,listViewDisplayActivity.class);
                intent.putExtra("ArrayList",items);
                startActivity(intent);
            }
        });
    }

}