package com.app.customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CountryItem> mCountryList;
    private CountryAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner);

        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getValue();
                Toast.makeText(MainActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("India", R.drawable.ic_launcher_foreground));
        mCountryList.add(new CountryItem("China", R.drawable.ic_launcher_foreground));
        mCountryList.add(new CountryItem("USA", R.drawable.ic_launcher_background));
        mCountryList.add(new CountryItem("Germany", R.drawable.ic_launcher_background));
    }
}
