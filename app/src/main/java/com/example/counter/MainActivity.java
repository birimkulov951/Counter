package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int number = 0;

    @SuppressLint("DefaultLocale")
    public void count(View view) {

        number++;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("%04d", number));
    }
}