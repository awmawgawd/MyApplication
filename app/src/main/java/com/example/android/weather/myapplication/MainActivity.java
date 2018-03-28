package com.example.android.weather.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome! Awesome!");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(24);
        textView.setMaxLines(2);

        setContentView(textView);
    }
}
