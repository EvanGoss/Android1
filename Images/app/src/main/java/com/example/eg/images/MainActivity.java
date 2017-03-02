package com.example.eg.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String currentImage = "playerswing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        ImageView imageView = (ImageView) findViewById(R.id.imagePlayer);
        Button imageButton = (Button) findViewById(R.id.btnShowPlayer);

        if (currentImage == "playerswing") {
            imageView.setImageResource(R.drawable.playerpitch);
            currentImage = "playerpitch";
            imageButton.setText("Show Hit");
        } else {
            imageView.setImageResource(R.drawable.playerswing);
            currentImage = "playerswing";
            imageButton.setText("Show Pitch");
        }
    }
}
