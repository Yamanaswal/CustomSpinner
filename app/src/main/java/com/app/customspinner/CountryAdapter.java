package com.app.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryItem> {


    public CountryAdapter(@NonNull Context context, ArrayList<CountryItem> list) {
        super(context, 0, list);
    }

    /*
    Setting the View of Adapter -- getItem(position) and getContext()
     */
    private View initView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_spinner_row, parent, false);
        }

        ImageView flagImage = convertView.findViewById(R.id.flagImage);
        TextView text = convertView.findViewById(R.id.textView);

        CountryItem countryItem = getItem(position);

        if (countryItem != null) {
            flagImage.setImageResource(countryItem.getCountry());
            text.setText(countryItem.getValue());
        }


        return convertView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }


}
