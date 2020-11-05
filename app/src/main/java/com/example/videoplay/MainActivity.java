package com.example.videoplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoplay;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoplay=findViewById(R.id.videoplay);
        videoplay.setVideoPath("android.resource://"+getPackageName()+ "/"+R.raw.videoplay);
        videoplay.start();

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoplay);
        videoplay.setMediaController(mediaController);



    }
}