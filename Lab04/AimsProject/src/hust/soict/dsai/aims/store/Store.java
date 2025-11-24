package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    public static final int MAX_ITEMS = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // ===== Add a Media to the store =====
    public void addMedia(Media media) {
        if (itemsInStore.size() < MAX_ITEMS) {
            itemsInStore.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more media.");
        }
    }

    // ===== Remove a Media from the store =====
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not found in the store.");
        }
    }

    // ===== Display all Media in the store =====
    public void printStore() {
        System.out.println("***********************STORE***********************");
        int i = 1;
        for (Media m : itemsInStore) {
            System.out.println((i++) + ". " + m.toString());
        }
        System.out.println("***************************************************");
    }

    // ===== Search Media by title =====
    public Media searchMediaByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }

    // ===== Get all items in store (for displaying) =====
    public ArrayList<Media> getItemsInStore() {
        return new ArrayList<>(itemsInStore);
    }
}