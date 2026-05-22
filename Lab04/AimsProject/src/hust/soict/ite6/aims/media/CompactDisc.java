package hust.soict.ite6.aims.media;

import java.util.ArrayList;

public class CompactDisc
        extends Disc
        implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title,
                       String category,
                       String director,
                       int length,
                       float cost,
                       String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added");
        } else {
            System.out.println("Track already exists");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        } else {
            System.out.println("Track does not exist");
        }
    }
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        if (this.getLength() <= 0) {
            System.out.println("The CD " + this.getTitle() + " cannot be played because its total length is 0 or less.");
            return;
        }
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - Artist: " + artist
                + " - Director: " + getDirector() + " - Length: " + getLength() + " mins: " + getCost() + " $";
    }
}