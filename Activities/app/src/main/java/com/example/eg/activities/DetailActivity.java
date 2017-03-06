package com.example.eg.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        String name = getIntent().getStringExtra(MainActivity.SPORT_NAME);
        String desc = getIntent().getStringExtra(MainActivity.SPORT_DESCRIPTION);

        TextView textView = (TextView) findViewById(R.id.tvHeader);
        textView.setText(name);

        TextView textDesc = (TextView) findViewById(R.id.tvText);
        textDesc.setText(desc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
