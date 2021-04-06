package org.haqnawaz.learning_english_alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class AlphabetLearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_learning);

        VideoView videoView = findViewById(R.id.videoAlphabetLearning);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.alphabet_learning);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}