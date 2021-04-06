package org.haqnawaz.learning_english_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlphabetsWithSounds extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_with_sounds);
    }
    public void ShowRotation(View view)
    {
        ImageView imageView = findViewById(view.getId());
        imageView.animate().rotationBy(360).setDuration(2000);
    }
    public void AlphabetA(View view) {
        ShowRotation(view);
    }
    public void AlphabetB(View view) {
        ShowRotation(view);
    }
    public void AlphabetC(View view) {
        ShowRotation(view);
    }
    public void AlphabetD(View view) {
        ShowRotation(view);
    }
    public void AlphabetE(View view) {
        ShowRotation(view);
    }
    public void AlphabetF(View view) {
        ShowRotation(view);
    }
    public void AlphabetG(View view) {
        ShowRotation(view);
    }
    public void AlphabetH(View view) {
        ShowRotation(view);
    }
    public void AlphabetI(View view) {
        ShowRotation(view);
    }
    public void AlphabetJ(View view) {
        ShowRotation(view);
    }
    public void AlphabetK(View view) {
        ShowRotation(view);
    }
    public void AlphabetL(View view) {
        ShowRotation(view);
    }
    public void AlphabetM(View view) {
        ShowRotation(view);
    }
    public void AlphabetN(View view) {
        ShowRotation(view);
    }
    public void AlphabetO(View view) {
        ShowRotation(view);
    }
    public void AlphabetP(View view) {
        ShowRotation(view);
    }
    public void AlphabetQ(View view) {
        ShowRotation(view);
    }
    public void AlphabetR(View view) {
        ShowRotation(view);
    }
    public void AlphabetS(View view) {
        ShowRotation(view);
    }
    public void AlphabetT(View view) {
        ShowRotation(view);
    }
    public void AlphabetU(View view) {
        ShowRotation(view);
    }
    public void AlphabetV(View view) {
        ShowRotation(view);
    }
    public void AlphabetW(View view) {
        ShowRotation(view);
    }
    public void AlphabetX(View view) {
        ShowRotation(view);
    }
    public void AlphabetY(View view) {
        ShowRotation(view);
    }
    public void AlphabetZ(View view) {
        ShowRotation(view);
    }

}