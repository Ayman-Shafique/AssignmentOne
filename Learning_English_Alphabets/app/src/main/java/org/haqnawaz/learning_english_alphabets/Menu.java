package org.haqnawaz.learning_english_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void AlphabetSounds(View view) {
        Intent intent = new Intent(Menu.this, AlphabetsWithSounds.class);
        startActivity(intent);
    }

    public void AlphabetSong(View view) {
        Intent intent = new Intent(Menu.this, AlphabetSongVideo.class);
        startActivity(intent);
    }

    public void LearnAlphabetSong(View view) {
        Intent intent = new Intent(Menu.this, AlphabetLearning.class);
        startActivity(intent);
    }

    public void AlphabetPhonics(View view) {
        Intent intent = new Intent(Menu.this, AlphabetPhonics.class);
        startActivity(intent);
    }
}