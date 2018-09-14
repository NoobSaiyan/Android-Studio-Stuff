package com.example.dell.musictest;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp=new MediaPlayer();
    AudioManager am;
    int minVal;
    public void play(View view) {

        this.mp.start();
    }

    public  void paus(View view){
        this.mp.pause();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        am= (AudioManager) getSystemService(AUDIO_SERVICE);
        mp= MediaPlayer.create(this, R.raw.blackbear);
        SeekBar vc = findViewById(R.id.volumeSeekBar);
        SeekBar sc = findViewById(R.id.seekBar);
        int maxval = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int current = am.getStreamVolume(AudioManager.STREAM_MUSIC);
        vc.setProgress(current);
        vc.setMax(maxval);

        vc.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("Info",Integer.toString(progress));
                am.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
            sc.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener())

        });

    }
}
