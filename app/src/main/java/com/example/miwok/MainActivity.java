package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openNumbersList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }
    public void openFamilyList(View view){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void opencolorsList(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
    public void openphrasesList(View view){
        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }
}