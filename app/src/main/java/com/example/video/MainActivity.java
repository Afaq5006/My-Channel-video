package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.VV_main);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.video));


        MediaController mediaController = new MediaController(this);
        VideoView videoView1 = (VideoView) findViewById(R.id.VV_main);
        videoView1.setMediaController(mediaController);
    }
}