package com.example.cosmic_1.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cosmic_1.R;


public class things_fragment extends Fragment {
ListView listView;
ArrayAdapter<String> adapter;
String[] data = {"sonu","aditi","sai","radhika","mohit","sofia"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_things, container, false);

        return view;
    }
}