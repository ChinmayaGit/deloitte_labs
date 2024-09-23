package com.deloitte.lab4.ex2.items.media;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numOfCopies, int runtime, String artist, String genre) {
        super(id, title, numOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + toString());
    }
}
