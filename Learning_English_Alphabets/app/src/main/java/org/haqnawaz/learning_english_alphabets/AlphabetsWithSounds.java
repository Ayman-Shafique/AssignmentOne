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
        mp=MediaPlayer.create(this,R.raw.a_sound);
        mp.start();
    }
    public void AlphabetB(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.b_sound);
        mp.start();
    }
    public void AlphabetC(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.c_sound);
        mp.start();
    }
    public void AlphabetD(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.d_sound);
        mp.start();
    }
    public void AlphabetE(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.e_sound);
        mp.start();
    }
    public void AlphabetF(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.g_sound);
        mp.start();
    }
    public void AlphabetG(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.g_sound);
        mp.start();
    }
    public void AlphabetH(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.h_sound);
        mp.start();
    }
    public void AlphabetI(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.i_sound);
        mp.start();
    }
    public void AlphabetJ(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.j_sound);
        mp.start();
    }
    public void AlphabetK(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.k_sound);
        mp.start();
    }
    public void AlphabetL(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.l_sound);
        mp.start();
    }
    public void AlphabetM(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.m_sound);
        mp.start();
    }
    public void AlphabetN(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.n_sound);
        mp.start();
    }
    public void AlphabetO(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.o_sound);
        mp.start();
    }
    public void AlphabetP(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.p_sound);
        mp.start();
    }
    public void AlphabetQ(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.q_sound);
        mp.start();
    }
    public void AlphabetR(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.r_sound);
        mp.start();
    }
    public void AlphabetS(View view) {
        ShowRotation(view);
        //mp=MediaPlayer.create(this,R.raw.s_sound);
        //mp.start();
    }
    public void AlphabetT(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.t_sound);
        mp.start();
    }
    public void AlphabetU(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.u_sound);
        mp.start();
    }
    public void AlphabetV(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.v_sound);
        mp.start();
    }
    public void AlphabetW(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.w_sound);
        mp.start();
    }
    public void AlphabetX(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.x_sound);
        mp.start();
    }
    public void AlphabetY(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.y_sound);
        mp.start();
    }
    public void AlphabetZ(View view) {
        ShowRotation(view);
        mp=MediaPlayer.create(this,R.raw.z_sound);
        mp.start();
    }

}