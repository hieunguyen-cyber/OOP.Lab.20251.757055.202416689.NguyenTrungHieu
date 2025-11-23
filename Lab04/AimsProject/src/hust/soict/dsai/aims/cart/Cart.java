package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Add media - generic method
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Item already in cart.");
        } else {
            itemsOrdered.add(media);
            System.out.println("Item added to cart.");
        }
    }

    // Legacy method for backward compatibility
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        addMedia(dvd);
    }

    // Remove media - generic method
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    // Legacy method for backward compatibility
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        removeMedia(dvd);
    }

    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float total = 0;
        int i = 1;
        for (Media m : itemsOrdered) {
            System.out.println(i + ". " + m.toString());
            total += m.getCost();
            i++;
        }
        System.out.println("Total cost: " + total + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.isIdMatch(id)) {
                System.out.println("Found: " + m.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m.isTitleMatch(title)) {
                System.out.println("Found: " + m.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: \"" + title + "\"");
        }
    }
}