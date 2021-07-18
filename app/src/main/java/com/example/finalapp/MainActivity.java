package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    int counter = 1, check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.m1);

        CheckBox rdb = (CheckBox) findViewById(R.id.checkmusic);
        rdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();
                // Check which radiobutton was pressed
                if (checked){
                    check=1;
                    mp.start();
                }
                else{
                    check=0;
                    mp.pause();
                }
            }
        });

        if(check==1)
            mp.start();
        mp.setLooping(true);
    }

    public void nextimg(View v){

        if(counter==1) {
            mp.stop();
            ImageView i1 = (ImageView) findViewById(R.id.imageView1);
            i1.setVisibility(View.INVISIBLE);
            ImageView i2 = (ImageView) findViewById(R.id.imageView2);
            i2.setVisibility(View.VISIBLE);
            counter=2;
            mp = MediaPlayer.create(this, R.raw.m2);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==2) {
            mp.stop();
            ImageView i2 = (ImageView) findViewById(R.id.imageView2);
            i2.setVisibility(View.INVISIBLE);
            ImageView i3 = (ImageView) findViewById(R.id.imageView3);
            i3.setVisibility(View.VISIBLE);
            counter=3;
            mp = MediaPlayer.create(this, R.raw.m3);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==3) {
            mp.stop();
            ImageView i3 = (ImageView) findViewById(R.id.imageView3);
            i3.setVisibility(View.INVISIBLE);
            ImageView i4 = (ImageView) findViewById(R.id.imageView4);
            i4.setVisibility(View.VISIBLE);
            counter=4;
            mp = MediaPlayer.create(this, R.raw.m4);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==4) {
            mp.stop();
            ImageView i4 = (ImageView) findViewById(R.id.imageView4);
            i4.setVisibility(View.INVISIBLE);
            ImageView i5 = (ImageView) findViewById(R.id.imageView5);
            i5.setVisibility(View.VISIBLE);
            counter=5;
            mp = MediaPlayer.create(this, R.raw.m5);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==5) {
            mp.stop();
            ImageView i5 = (ImageView) findViewById(R.id.imageView5);
            i5.setVisibility(View.INVISIBLE);
            ImageView i6 = (ImageView) findViewById(R.id.imageView6);
            i6.setVisibility(View.VISIBLE);
            counter=6;
            mp = MediaPlayer.create(this, R.raw.m6);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==6) {
            mp.stop();
            ImageView i6 = (ImageView) findViewById(R.id.imageView6);
            i6.setVisibility(View.INVISIBLE);
            ImageView i7 = (ImageView) findViewById(R.id.imageView7);
            i7.setVisibility(View.VISIBLE);
            counter=7;
            mp = MediaPlayer.create(this, R.raw.m7);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==7) {
            mp.stop();
            ImageView i7 = (ImageView) findViewById(R.id.imageView7);
            i7.setVisibility(View.INVISIBLE);
            ImageView i8 = (ImageView) findViewById(R.id.imageView8);
            i8.setVisibility(View.VISIBLE);
            counter=8;
            mp = MediaPlayer.create(this, R.raw.m8);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==8) {
            mp.stop();
            ImageView i8 = (ImageView) findViewById(R.id.imageView8);
            i8.setVisibility(View.INVISIBLE);
            ImageView i9 = (ImageView) findViewById(R.id.imageView9);
            i9.setVisibility(View.VISIBLE);
            counter=9;
            mp = MediaPlayer.create(this, R.raw.m9);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==9) {
            mp.stop();
            ImageView i9 = (ImageView) findViewById(R.id.imageView9);
            i9.setVisibility(View.INVISIBLE);
            ImageView i10 = (ImageView) findViewById(R.id.imageView10);
            i10.setVisibility(View.VISIBLE);
            counter=10;
            mp = MediaPlayer.create(this, R.raw.m10);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==10) {
            mp.stop();
            ImageView i10 = (ImageView) findViewById(R.id.imageView10);
            i10.setVisibility(View.INVISIBLE);
            ImageView i11 = (ImageView) findViewById(R.id.imageView11);
            i11.setVisibility(View.VISIBLE);
            counter=11;
            mp = MediaPlayer.create(this, R.raw.m11);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==11) {
            mp.stop();
            ImageView i11 = (ImageView) findViewById(R.id.imageView11);
            i11.setVisibility(View.INVISIBLE);
            ImageView i12 = (ImageView) findViewById(R.id.imageView12);
            i12.setVisibility(View.VISIBLE);
            counter=12;
            mp = MediaPlayer.create(this, R.raw.m12);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
        else if(counter==12) {
            mp.stop();
            ImageView i12 = (ImageView) findViewById(R.id.imageView12);
            i12.setVisibility(View.INVISIBLE);
            ImageView i1 = (ImageView) findViewById(R.id.imageView1);
            i1.setVisibility(View.VISIBLE);
            counter=1;
            mp = MediaPlayer.create(this, R.raw.m1);

            if(check==1)
                mp.start();
            mp.setLooping(true);
        }
    }
}