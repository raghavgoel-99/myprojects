package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Intent intent = getIntent();
        String message= intent.getStringExtra(MainActivity.msg);
        TextView text = findViewById(R.id.order);
        text.setText(message);
    }
}
