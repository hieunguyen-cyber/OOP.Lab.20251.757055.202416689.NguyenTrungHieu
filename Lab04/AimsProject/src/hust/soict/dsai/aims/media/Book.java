package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {

    // ===== Authors field =====
    private ArrayList<String> authors = new ArrayList<String>();

    // ===== Constructor =====
    public Book() {
        super();
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    // ===== Methods for authors =====
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        return "Book[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
               ", cost=" + this.getCost() + ", authors=" + authors + "]";
    }
}