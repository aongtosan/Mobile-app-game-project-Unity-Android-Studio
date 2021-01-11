package com.example.runingtester;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.unity3d.player.UnityPlayer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
 static  String highscore = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Play(View e){
        final MediaPlayer mp =  MediaPlayer.create(this,R.raw.click_play);
        mp.start();
        Intent intent = new Intent(MainActivity.this,UnityHolder.class);
        startActivity(intent);

    }
    public void Show_Credit(View e){
        final MediaPlayer mp =  MediaPlayer.create(this,R.raw.click_play);
        mp.start();
        final AlertDialog.Builder dialog  = new AlertDialog.Builder(this);
        dialog.setTitle("Credit : We salute you all");
        dialog.setMessage("asset by: https://weeklyhow.com/flappy-bird-unity-tutorial/ \nTitle by: https://fontmeme.com/pixel-fonts/\nBackground by: https://wallhere.com/en/wallpaper/185540");
        dialog.setPositiveButton("close",null);
        dialog.show();


    }

    public void show_record(View view) {
            final MediaPlayer mp =  MediaPlayer.create(this,R.raw.click_play);
            mp.start();
            String data;
            String high_score ="";
            try {
                final AlertDialog.Builder dialog  = new AlertDialog.Builder(this);
                BufferedReader input = new BufferedReader(new InputStreamReader(openFileInput("hightscore.txt")));
                while ((data=input.readLine())!=null){
                 high_score = data;
                }
                dialog.setTitle("HighScore");
                dialog.setMessage(high_score);
                dialog.setPositiveButton("close",null);
                dialog.show();
            }catch (Exception e){
                Toast.makeText(this, "There are no hightscore record", Toast.LENGTH_SHORT).show();
            }


    }

}