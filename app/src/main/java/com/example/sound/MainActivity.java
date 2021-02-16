package com.example.sound;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        private SoundPool mSoundPool;
        private SoundPool mSoundPool1;
        private SoundPool mSoundPool2;
        private SoundPool mSoundPool3;
        private SoundPool mSoundPool4;

        private int mSoundCollision = 1;
        private int mSoundCollision1 = 1;
        private int mSoundCollision2 = 1;
        private int mSoundCollision3 = 1;
        private int mSoundCollision4 = 1;

        private int mStreamId;
        private int mStreamId1;
        private int mStreamId2;
        private int mStreamId3;
        private int mStreamId4;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            createNewSoundPool() ;
            createNewSoundPool1() ;
            createNewSoundPool2() ;
            createNewSoundPool3() ;
            createNewSoundPool4() ;

            mSoundPool.load(this, R.raw.poo, 1);
            mSoundPool1.load(this, R.raw.poo1, 1);
            mSoundPool2.load(this, R.raw.poo2, 1);
            mSoundPool3.load(this, R.raw.poo3, 1);
            mSoundPool4.load(this, R.raw.poo4, 1);


            Button playButton = (Button) findViewById(R.id.buttonPlay);
            Button playButton1 = (Button) findViewById(R.id.buttonPlay1);
            Button playButton2 = (Button) findViewById(R.id.buttonPlay2);
            Button playButton3 = (Button) findViewById(R.id.buttonPlay3);
            Button playButton4 = (Button) findViewById(R.id.buttonPlay4);

            playButton.setOnClickListener(onPlayButtonClickListener);
            playButton1.setOnClickListener(onPlayButtonClickListener1);
            playButton2.setOnClickListener(onPlayButtonClickListener2);
            playButton3.setOnClickListener(onPlayButtonClickListener3);
            playButton4.setOnClickListener(onPlayButtonClickListener4);
        }

        Button.OnClickListener onPlayButtonClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                mStreamId = mSoundPool.play(mSoundCollision,1,1,1,0,1);
                Toast.makeText(getApplicationContext(), "soundPool.play()", Toast.LENGTH_LONG).show();
            }
        };

    Button.OnClickListener onPlayButtonClickListener1 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            mStreamId1 = mSoundPool1.play(mSoundCollision1,1,1,1,0,1);
            Toast.makeText(getApplicationContext(), "soundPool.play()", Toast.LENGTH_LONG).show();
        }
    };

    Button.OnClickListener onPlayButtonClickListener2 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            mStreamId2 = mSoundPool2.play(mSoundCollision2,1,1,1,0,1);
            Toast.makeText(getApplicationContext(), "soundPool.play()", Toast.LENGTH_LONG).show();
        }
    };

    Button.OnClickListener onPlayButtonClickListener3 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            mStreamId3 = mSoundPool3.play(mSoundCollision3,1,1,1,0,1);
            Toast.makeText(getApplicationContext(), "soundPool.play()", Toast.LENGTH_LONG).show();
        }
    };

    Button.OnClickListener onPlayButtonClickListener4 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            mStreamId4 = mSoundPool4.play(mSoundCollision4,1,1,1,0,1);
            Toast.makeText(getApplicationContext(), "soundPool.play()", Toast.LENGTH_LONG).show();
        }
    };

        @TargetApi(Build.VERSION_CODES.LOLLIPOP) //вызов класса SoundPool.Builder
        private void createNewSoundPool() {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            mSoundPool = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();
        }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP) //вызов класса SoundPool.Builder
    private void createNewSoundPool1() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool1 = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP) //вызов класса SoundPool.Builder
    private void createNewSoundPool2() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool2 = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP) //вызов класса SoundPool.Builder
    private void createNewSoundPool3() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool3 = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP) //вызов класса SoundPool.Builder
    private void createNewSoundPool4() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool4 = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }
}