package com.example.eg.images;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    public static final int MENU_ITEM_ID = 1001;
    ImageView imageView;

    private void popToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imagePlayer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        MenuItem item = menu.add(Menu.NONE, MENU_ITEM_ID, 103, "Dynamic");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_ITEM_ID:
                popToast("Dynamic Menu Item");
                break;
            case R.id.menu_pitch:
                imageView.setImageResource(R.drawable.playerpitch);
                break;
            case R.id.menu_swing:
                imageView.setImageResource(R.drawable.playerswing);
                break;
            case R.id.menu_flag:
                try {
                    InputStream stream = getAssets().open("unitedstates.png");
                    Drawable drawable = Drawable.createFromStream(stream,null);
                    imageView.setImageDrawable(drawable);
                } catch (IOException e) {
                    popToast("Error in onClick");
                }
                break;
        }
        return true;
    }

}
