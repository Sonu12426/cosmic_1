package com.example.cosmic_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.cosmic_1.Fragment.affirmation_fragment;
import com.example.cosmic_1.Fragment.headSpace;
import com.example.cosmic_1.Fragment.meditation_fragment;
import com.example.cosmic_1.Fragment.symptoms_fragment;
import com.example.cosmic_1.Fragment.things_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    BottomNavigationView  bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainActivity, new symptoms_fragment());

transaction.commit();

        bottomNavigationView = findViewById(R.id.containers);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (item.getItemId())
                {
                    case R.id.affirmation:
                        transaction.replace(R.id.mainActivity, new affirmation_fragment());
break;

                    case R.id.meditation:
                        transaction.replace(R.id.mainActivity, new meditation_fragment());


                        break;

                    case R.id.HeadSPace_:
                        transaction.replace(R.id.mainActivity, new headSpace());


break;


                    case R.id.symptoms:
                        transaction.replace(R.id.mainActivity, new symptoms_fragment());
break;
                    case R.id.things:
                        transaction.replace(R.id.mainActivity, new things_fragment());
                }
                transaction.commit();
                return true;
            }
        });
    }
}