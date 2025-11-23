package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<>();
	private int pages;

	// Default constructor
	public Book() {
		super();
		this.pages = 0;
	}

	// Constructor with title, category, cost
	public Book(String title, String category, float cost) {
		super(0, title, category, cost);
		this.pages = 0;
	}

	// Constructor with id, title, category, cost, pages
	public Book(int id, String title, String category, float cost, int pages) {
		super(id, title, category, cost);
		this.pages = pages;
	}

	// Getters and Setters
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Author added.");
		} else {
			System.out.println("Author already exists.");
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author removed.");
		} else {
			System.out.println("Author not found.");
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		StringBuilder authorsStr = new StringBuilder();
		for (String author : authors) {
			if (authorsStr.length() > 0) authorsStr.append(", ");
			authorsStr.append(author);
		}
		return "Book[id=" + this.getId() + ", title=" + this.getTitle() + ", category=" + this.getCategory() + 
		       ", cost=" + this.getCost() + ", pages=" + pages + ", authors=" + authorsStr.toString() + "]";
	}
}
