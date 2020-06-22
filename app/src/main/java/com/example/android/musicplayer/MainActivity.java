package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private ImageButton playButton;
    private ImageButton stopButton;
    private ImageButton previousButton;
    private ImageButton nextButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons.
        playButton = findViewById(R.id.play_button);
        stopButton = findViewById(R.id.stop_button);
        previousButton = findViewById(R.id.previous_button);
        nextButton = findViewById(R.id.next_button);
        // Initialize media player.
        mediaPlayer = MediaPlayer.create(this, R.raw.singapur);

        // Play button listener.
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound...", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        // Stop button listener.
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing song.", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        // Previous button listener.
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SongsActivity.class);
                startActivity(i);
            }
        });

        // Next button listener.
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SongsActivity.class);
                startActivity(i);
            }
        });

    }
}