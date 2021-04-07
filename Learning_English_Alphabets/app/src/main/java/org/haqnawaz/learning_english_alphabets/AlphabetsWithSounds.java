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
        imageView.animate().rotationBy(360).setDuration(1500);
    }
    public void AlphabetSounds(View view) {
        ShowRotation(view);
        switch (view.getId())
        {
            case R.id.alphabetA:
                mp = MediaPlayer.create(this,R.raw.a_sound);
                break;
            case R.id.alphabetB:
                mp = MediaPlayer.create(this,R.raw.b_sound);
                break;
            case R.id.alphabetC:
                mp = MediaPlayer.create(this,R.raw.c_sound);
                break;
            case R.id.alphabetD:
                mp = MediaPlayer.create(this,R.raw.d_sound);
                break;
            case R.id.alphabetE:
                mp = MediaPlayer.create(this,R.raw.e_sound);
                break;
            case R.id.alphabetF:
                mp = MediaPlayer.create(this,R.raw.f_sound);
                break;
            case R.id.alphabetG:
                mp = MediaPlayer.create(this,R.raw.g_sound);
                break;
            case R.id.alphabetH:
                mp = MediaPlayer.create(this,R.raw.h_sound);
                break;
            case R.id.alphabetI:
                mp = MediaPlayer.create(this,R.raw.i_sound);
                break;
            case R.id.alphabetJ:
                mp = MediaPlayer.create(this,R.raw.j_sound);
                break;
            case R.id.alphabetK:
                mp = MediaPlayer.create(this,R.raw.k_sound);
                break;
            case R.id.alphabetL:
                mp = MediaPlayer.create(this,R.raw.l_sound);
                break;
            case R.id.alphabetM:
                mp = MediaPlayer.create(this,R.raw.m_sound);
                break;
            case R.id.alphabetN:
                mp = MediaPlayer.create(this,R.raw.n_sound);
                break;
            case R.id.alphabetO:
                mp = MediaPlayer.create(this,R.raw.o_sound);
                break;
            case R.id.alphabetP:
                mp = MediaPlayer.create(this,R.raw.p_sound);
                break;
            case R.id.alphabetQ:
                mp = MediaPlayer.create(this,R.raw.q_sound);
                break;
            case R.id.alphabetR:
                mp = MediaPlayer.create(this,R.raw.r_sound);
                break;
            case R.id.alphabetS:
                mp = MediaPlayer.create(this,R.raw.s_sound);
                break;
            case R.id.alphabetT:
                mp = MediaPlayer.create(this,R.raw.t_sound);
                break;
            case R.id.alphabetU:
                mp = MediaPlayer.create(this,R.raw.u_sound);
                break;
            case R.id.alphabetV:
                mp = MediaPlayer.create(this,R.raw.v_sound);
                break;
            case R.id.alphabetW:
                mp = MediaPlayer.create(this,R.raw.w_sound);
                break;
            case R.id.alphabetX:
                mp = MediaPlayer.create(this,R.raw.x_sound);
                break;
            case R.id.alphabetY:
                mp = MediaPlayer.create(this,R.raw.y_sound);
                break;
            case R.id.alphabetZ:
                mp = MediaPlayer.create(this,R.raw.z_sound);
                break;
        }
        mp.start();
    }
}