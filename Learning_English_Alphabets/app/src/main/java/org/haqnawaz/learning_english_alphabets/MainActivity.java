package org.haqnawaz.learning_english_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Display(View view) {
        //Intent intent = new Intent(MainActivity.this, AlphabetsWithSounds.class);
        Intent intent = new Intent(MainActivity.this, Menu.class);
        startActivity(intent);
    }
}