package org.haqnawaz.learning_english_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlphabetPhonics extends AppCompatActivity {
    TextView textView;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_phonics);
    }

    public void PhonicSound(View view) {

        textView = findViewById(view.getId());
        textView.animate().rotation(360).alpha(0).setDuration(2000);
        textView.animate().alpha(1).setDuration(2000);
        switch (view.getId())
        {
            case R.id.aPhonic:
                mp = MediaPlayer.create(this,R.raw.a_phonic);
                break;
            case R.id.bPhonic:
                mp = MediaPlayer.create(this,R.raw.b_phonic);
                break;
            case R.id.cPhonic:
                mp = MediaPlayer.create(this,R.raw.c_phonic);
                break;
            case R.id.dPhonic:
                mp = MediaPlayer.create(this,R.raw.d_phonic);
                break;
            case R.id.ePhonic:
                mp = MediaPlayer.create(this,R.raw.e_phonic);
                break;
            case R.id.fPhonic:
                mp = MediaPlayer.create(this,R.raw.f_phonic);
                break;
            case R.id.gPhonic:
                mp = MediaPlayer.create(this,R.raw.g_phonic);
                break;
            case R.id.hPhonic:
                mp = MediaPlayer.create(this,R.raw.h_phonic);
                break;
            case R.id.iPhonic:
                mp = MediaPlayer.create(this,R.raw.i_phonic);
                break;
            case R.id.jPhonic:
                mp = MediaPlayer.create(this,R.raw.j_phonic);
                break;
            case R.id.kPhonic:
                mp = MediaPlayer.create(this,R.raw.k_phonic);
                break;
            case R.id.lPhonic:
                mp = MediaPlayer.create(this,R.raw.l_phonic);
                break;
            case R.id.mPhonic:
                mp = MediaPlayer.create(this,R.raw.m_phonic);
                break;
            case R.id.nPhonic:
                mp = MediaPlayer.create(this,R.raw.n_phonic);
                break;
            case R.id.oPhonic:
                mp = MediaPlayer.create(this,R.raw.o_phonic);
                break;
            case R.id.pPhonic:
                mp = MediaPlayer.create(this,R.raw.p_phonic);
                break;
            case R.id.qPhonic:
                mp = MediaPlayer.create(this,R.raw.q_phonic);
                break;
            case R.id.rPhonic:
                mp = MediaPlayer.create(this,R.raw.r_phonic);
                break;
            case R.id.sPhonic:
                mp = MediaPlayer.create(this,R.raw.s_phonic);
                break;
            case R.id.tPhonic:
                mp = MediaPlayer.create(this,R.raw.t_phonic);
                break;
            case R.id.uPhonic:
                mp = MediaPlayer.create(this,R.raw.u_phonic);
                break;
            case R.id.vPhonic:
                mp = MediaPlayer.create(this,R.raw.v_phonic);
                break;
            case R.id.wPhonic:
                mp = MediaPlayer.create(this,R.raw.w_phonic);
                break;
            case R.id.xPhonic:
                mp = MediaPlayer.create(this,R.raw.x_phonic);
                break;
            case R.id.yPhonic:
                mp = MediaPlayer.create(this,R.raw.y_phonic);
                break;
            case R.id.zPhonic:
                mp = MediaPlayer.create(this,R.raw.z_phonic);
                break;
        }
        mp.start();
    }
}