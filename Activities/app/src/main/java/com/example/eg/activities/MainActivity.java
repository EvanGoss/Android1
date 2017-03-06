package com.example.eg.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String SPORT_NAME = "sport_name";
    public static final String SPORT_DESCRIPTION = "sport_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Sport bb = new Sport();

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(SPORT_NAME, bb.getName());
        intent.putExtra(SPORT_DESCRIPTION, bb.getDescription());

        startActivity(intent);
    }
}
