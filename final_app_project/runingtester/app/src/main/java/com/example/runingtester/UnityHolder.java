package com.example.runingtester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;


public class UnityHolder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder);
        Intent intent =  new Intent(UnityHolder.this, UnityPlayerActivity.class) ;
        startActivity(intent);


    }
}