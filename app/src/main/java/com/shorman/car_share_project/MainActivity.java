package com.shorman.car_share_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.shorman.car_share_project.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        Resources res = getResources();
        String[] destinations = res.getStringArray(R.array.destinations);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.drop_down_item,destinations);

        binding.autoCompleteText.setAdapter(adapter);
        binding.autoCompleteText2.setAdapter(adapter);

        Trip[] trips = {
                new Trip("Sami","22/4/2021 - 4am","BMW x5","Black"),
                new Trip("Mohmmad","22/5/2021 - 2pm","Toyota corola","white"),
                new Trip("Rami","14/2/2021 - 1am","Huenday accent","blue"),
                new Trip("Sami","22/4/2021 - 4am","BMW x5","Black"),
                new Trip("Sami","22/4/2021 - 4am","BMW x5","Black"),

        };

        TripsAdapter adapter1 = new TripsAdapter(trips);
        binding.rvAvailableTrips.setAdapter(adapter1);



    }
}