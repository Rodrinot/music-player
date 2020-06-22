package com.example.android.musicplayer;

/**
 * {@link Song} represents a vocabulary song.
 * It contains a title and an artist.
 */
public class Song {

    /** Title of the song */
    private String mTitle;

    /** Artist of the song */
    private String mArtist;

    /** Image resource id */
    private int mResourceImageId;

    /** Image resource id */
    private int mResourceAudioId;

    /**
     * Create a new Song object.
     *
     * @param title
     * @param artist
     * @param resourceImageId
     * @param resourceAudioId
     */
    public Song(String title, String artist, int resourceImageId, int resourceAudioId) {
        mTitle = title;
        mArtist = artist;
        mResourceImageId = resourceImageId;
        mResourceAudioId = resourceAudioId;
    }

    /**
     * Get the title of the Song.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the artist of the Song.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the resource image id of the Song.
     */
    public int getImageResourceId() { return mResourceImageId; }

    /**
     * Get the resource image id of the Song.
     */
    public int getAudioResourceId() { return mResourceAudioId; }

}

