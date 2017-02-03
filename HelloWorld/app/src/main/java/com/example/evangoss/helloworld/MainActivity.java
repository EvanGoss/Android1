package com.example.evangoss.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.txtName);
        Toast.makeText(MainActivity.this, "Hello "+editText.getText(), Toast.LENGTH_SHORT).show();
    }
}
