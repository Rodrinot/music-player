package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs.
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));
        songs.add(new Song("Singapur", "El Alfa & Chael", R.drawable.cover, R.raw.singapur));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Song_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Song} object at the given position the user clicked on
                Song Song = songs.get(position);
                Intent i = new Intent(view.getContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}