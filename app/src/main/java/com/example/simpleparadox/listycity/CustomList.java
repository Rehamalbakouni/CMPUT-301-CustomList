package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.content, parent, false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * this function will get the size of list
     *
     * @return
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * this function will add city object into the list
     *
     * @return
     */
    public void addCity(City city) {
        cities.add(city);
        return;
    }

    /**
     * this function will check if a city is in the list
     *
     * @return
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * this function will delete a city from the list
     *
     * @return
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();

        }
    }

    /**
     * this function will count the cities in the list
     *
     * @return
     */
    public int countCities() {
        return cities.size();
    }
}
