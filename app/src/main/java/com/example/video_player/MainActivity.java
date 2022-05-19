package com.example.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.videoView2);

        videoView.setVideoPath("android.resource://"+getPackageName()
        +"/"+R.raw.androidvideo);

        Log.v("package",getPackageName());

        MediaController mediaController=new MediaController(this);

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();


    }
}