package com.example.evangoss.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayout layout = (LinearLayout) findViewById(R.id.myLayout);
        for (int i=0; i < 3; i++) {
            Button button = new Button(this);
            button.setText(getString(R.string.button_text) + (i+1));
            button.setLayoutParams(layoutParams);
            layout.addView(button);
        }
    }
}
