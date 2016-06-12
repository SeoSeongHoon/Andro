package com.example.tgs.latte;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by TGS on 2016-06-12.
 */
public class MediaActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mediaactivity);

        VideoView videoViewExample = (VideoView)findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);

        Uri videoUri = Uri.parse(
                "android.resource://" + getPackageName() + "/raw/dumb"
        );

        videoViewExample.setMediaController(mc);
        videoViewExample.setVideoURI(videoUri);
        videoViewExample.start();
    }
}