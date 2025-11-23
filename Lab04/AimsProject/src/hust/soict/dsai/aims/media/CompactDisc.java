package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Default constructor
    public CompactDisc() {
        super();
        this.artist = "";
    }

    // Constructor with title, category, artist, cost
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    // Constructor with id, title, category, artist, cost, length, director
    public CompactDisc(int id, String title, String category, String artist, float cost, int length) {
        super(id, title, category, cost, length, "");
        this.artist = artist;
    }

    // Constructor with title, category, artist, cost, length, director
    public CompactDisc(String title, String category, String artist, float cost, int length, String director) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already in list.");
        } else {
            tracks.add(track);
            System.out.println("Track added.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed.");
        } else {
            System.out.println("Track not found.");
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track t : tracks) {
            sum += t.getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.artist);
        System.out.println("Total length: " + this.getLength());
        for (Track t : tracks) {
            t.play();
        }
    }

    @Override
    public String toString() {
        return "CD[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
               ", cost=" + this.getCost() + ", artist=" + artist + "]";
    }
}