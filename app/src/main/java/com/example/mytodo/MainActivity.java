package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.LoginActivity);

        Toast t  = Toast.makeText(MainActivity.this , "Welcome to My ToDo application!" , Toast.LENGTH_SHORT);
        t.show();
    }
}
