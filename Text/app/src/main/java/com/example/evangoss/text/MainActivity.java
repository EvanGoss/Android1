package com.example.evangoss.text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.longText);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            stringBuilder.append(String.valueOf(i));
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(getString(R.string.longtext));
            stringBuilder.append(System.lineSeparator());
        }
        textView.setText(stringBuilder.toString());
    }
}
