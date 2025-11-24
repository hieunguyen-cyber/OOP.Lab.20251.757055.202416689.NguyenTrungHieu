package hust.soict.dsai.aims.media;

public class Disc extends Media {

    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
        this.length = 0;
        this.director = "";
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Disc[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
               ", cost=" + this.getCost() + ", length=" + length + ", director=" + director + "]";
    }
}