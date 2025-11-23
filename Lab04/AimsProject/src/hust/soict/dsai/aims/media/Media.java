package hust.soict.dsai.aims.media;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Default constructor
    public Media() {
    }

    // Parameterized constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getter và Setter cho id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter và Setter cho title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và Setter cho category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter và Setter cho cost
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    // Helper methods for searching
    public boolean isIdMatch(int id) {
        return this.id == id;
    }

    public boolean isTitleMatch(String title) {
        return this.title.contains(title);
    }

    @Override
    public String toString() {
        return "Media[id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }
}