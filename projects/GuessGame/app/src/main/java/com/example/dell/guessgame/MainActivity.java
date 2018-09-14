package com.example.dell.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    Integer rand;
    Integer flag;

    public void genFun(View view){
        Random rand = new Random();
        this.rand = rand.nextInt(50);
        Toast.makeText(this, "New number is generated", Toast.LENGTH_SHORT).show();
        Log.i("Info", "Number gen "+this.rand);
        ImageView img = (ImageView) findViewById(R.id.imageView3);
        img.setImageResource(R.drawable.think);
        this.flag=1;
    }

    public void checkFun(View view){
        EditText et = (EditText) findViewById(R.id.guess);
        String ans = et.getText().toString();
        Integer anS = Integer.parseInt(ans) ;
        Integer nVal = this.rand;
        if(anS == nVal){
            Toast.makeText(this, "Correct answer !!", Toast.LENGTH_SHORT).show();
            ImageView img = (ImageView) findViewById(R.id.imageView3);
            img.setImageResource(R.drawable.correct);
        }
        else if(anS <= nVal){
            Toast.makeText(this, "Higher!!", Toast.LENGTH_SHORT).show();
        }
        else if(anS >= nVal){
            Toast.makeText(this, "Lower!!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Enter right option!!", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
