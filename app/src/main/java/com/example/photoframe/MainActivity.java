package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String msg="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeorder (View view)
    {
        Intent intent =new Intent(this,second_screen.class);
        EditText edittext1=findViewById(R.id.text1);
        EditText edittext2=findViewById(R.id.text2);
        EditText edittext3=findViewById(R.id.text3);
        String message =edittext1.getText().toString() + " , " + edittext2.getText().toString() + " and "+edittext3.getText().toString() + " have been successfully placed";
        intent.putExtra(msg,message);
        startActivity(intent);
    }
}
