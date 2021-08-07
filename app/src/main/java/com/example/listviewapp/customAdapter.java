package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class customAdapter extends ArrayAdapter {
    private String[] arr;
    public customAdapter(@NonNull Context context, int resource ,@NonNull String[] arr) {
        super(context, resource,arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView2);
        t.setText(getItem(position).toString());
        return convertView;
    }
}
