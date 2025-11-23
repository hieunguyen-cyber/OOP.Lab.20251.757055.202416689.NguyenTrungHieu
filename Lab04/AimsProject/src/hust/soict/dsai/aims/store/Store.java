package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Item already in store.");
        } else {
            itemsInStore.add(media);
            System.out.println("Item added to store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Item removed from store.");
        } else {
            System.out.println("Item not found in store.");
        }
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        int i = 1;
        for (Media m : itemsInStore) {
            System.out.println(i + ". " + m.toString());
            i++;
        }
        System.out.println("***************************************************");
    }
}