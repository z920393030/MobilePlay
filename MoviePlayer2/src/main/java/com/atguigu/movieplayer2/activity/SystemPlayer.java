package com.atguigu.movieplayer2.activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.atguigu.movieplayer2.R;

public class SystemPlayer extends AppCompatActivity {
private VideoView video_view;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_video_player);
        video_view = (VideoView)findViewById(R.id.video_view);
        uri=getIntent().getData();
        video_view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                video_view.start();
            }
        });
        video_view.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(SystemPlayer.this, "播放错误", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        video_view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(SystemPlayer.this, "播放完成", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        video_view.setVideoURI(uri);
        video_view.setMediaController(new MediaController(this));

    }
}
