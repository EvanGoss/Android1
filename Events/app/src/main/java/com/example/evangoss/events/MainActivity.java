package com.example.evangoss.events;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "EMG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(sharedClickListener);
        button2.setOnClickListener(sharedClickListener);

        EditText editText = (EditText) findViewById(R.id.editName);
        if (getResources().getConfiguration().orientation == 1) {
            editText.setText("Portrait");
        } else {
            editText.setText("Landscape");
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        EditText editText = (EditText) findViewById(R.id.editName);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            editText.setText("Portrait");
        } else {
            editText.setText("Landscape");
        }
    }

    private View.OnClickListener sharedClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    popToast("FROM CODE you click on the From XML Button");
                    break;
                case R.id.button2:
                    popToast("FROM CODE you click on the From Code Button");
                    break;
            }
        }
    };

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                popToast("You click on the From XML button");
                break;
            case R.id.button2:
                popToast("You click on the From Code button");
                break;
        }
    }

    private void popToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    private void popAlert(String title, String message) {
        android.support.v7.app.AlertDialog.Builder builder =
                new android.support.v7.app.AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setIcon(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_info_details))
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create()
                .show();
    }
}
