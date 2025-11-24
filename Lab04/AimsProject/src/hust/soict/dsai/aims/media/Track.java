package hust.soict.dsai.aims.media;

public class Track implements Playable {

    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public void play() {
        System.out.println("Playing Track: " + title + " (" + length + ")");
    }

    // ===== Override equals =====
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Track)) return false;
        Track other = (Track) obj;
        if (this.title == null) return other.title == null && this.length == other.length;
        return this.title.equals(other.title) && this.length == other.length;
    }

    @Override
    public int hashCode() {
        int result = (title == null) ? 0 : title.hashCode();
        result = 31 * result + length;
        return result;
    }
}