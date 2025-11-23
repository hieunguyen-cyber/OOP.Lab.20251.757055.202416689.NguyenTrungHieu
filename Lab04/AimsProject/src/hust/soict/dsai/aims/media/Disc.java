package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    // Default constructor
    public Disc() {
        super();
    }

    // Constructor with id, title, category, cost, length, director
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Constructor with title, category, cost, length, director (no id)
    public Disc(String title, String category, float cost, int length, String director) {
        super(0, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Constructor with title, category, cost (no length, director)
    public Disc(String title, String category, float cost) {
        super(0, title, category, cost);
        this.length = 0;
        this.director = "";
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Setter cho length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter cho director
    public String getDirector() {
        return director;
    }

    // Setter cho director
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Disc[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
               ", cost=" + this.getCost() + ", length=" + length + ", director=" + director + "]";
    }
}