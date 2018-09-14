package com.example.dell.fader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        Log.i("Info","Tapped");
        ImageView m = (ImageView) findViewById(R.id.naru);
        m.animate().scaleX(0).scaleY(0).alpha(0).rotationBy(1800).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView l = (ImageView) findViewById(R.id.naru);
        l.setX(-1000);
        l.animate().scaleY(0.5f).scaleX(0.5f).translationXBy(1000).rotationBy(1800).setDuration(2000);
    }
}
