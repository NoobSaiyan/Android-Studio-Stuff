package com.example.dell.somethingnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFun(View view){
        Log.i("info","Button pressed!!");
        EditText et = findViewById(R.id.nameEdit);
        EditText pt = findViewById(R.id.passEdit);

       Log.i("Username", et.getText().toString() );
       Log.i("Password", pt.getText().toString() );

        Toast.makeText(this, "Welcome!! "+et.getText().toString(), Toast.LENGTH_SHORT).show();

        ImageView img = (ImageView) findViewById(R.id.imgView);
        img.setImageResource(R.drawable.rila2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
