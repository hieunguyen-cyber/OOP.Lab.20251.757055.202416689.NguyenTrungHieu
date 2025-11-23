package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    // Default constructor
    public DigitalVideoDisc() {
        super();
    }

    // Constructor with just title
    public DigitalVideoDisc(String title) {
        super(title, "", 0);
    }

    // Constructor with title and category
    public DigitalVideoDisc(String title, String category) {
        super(title, category, 0);
    }

    // Constructor with title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    // Constructor with title, category, and director
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost, 0, director);
    }

    // Constructor with full parameters (title, category, cost, length, director)
    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    // Constructor with id and all parameters
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVD[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
               ", cost=" + this.getCost() + ", length=" + this.getLength() + ", director=" + this.getDirector() + "]";
    }
}