package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
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