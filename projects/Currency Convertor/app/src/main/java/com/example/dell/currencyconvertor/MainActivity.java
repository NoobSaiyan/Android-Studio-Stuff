package com.example.dell.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void calcFun(View view){
        EditText t = (EditText)findViewById(R.id.curEdit);
        String te = t.getText().toString();
        Double val = Double.parseDouble(te);
        val *= 70;
        //Log.i("Info",o);
        Toast.makeText(this,"In Rupee = "+val+"rs", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
