package com.example.maxim.androidhw14;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvHumidity;
    TextView tvWind;
    TextView tvCity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        tvCity = findViewById(R.id.second_tv_city);
        tvHumidity = findViewById(R.id.second_tv_humidity);
        tvWind = findViewById(R.id.second_tv_wind);

        Intent intent = getIntent();
        String city = intent.getStringExtra("city");
        boolean humidityIsSet = intent.getBooleanExtra("humidity", false);
        boolean windIsSet = intent.getBooleanExtra("wind", false);

        if (city != null)
            tvCity.setText(city);

        if (humidityIsSet)
            tvHumidity.setVisibility(View.VISIBLE);
        if (windIsSet)
            tvWind.setVisibility(View.VISIBLE);
    }
}
