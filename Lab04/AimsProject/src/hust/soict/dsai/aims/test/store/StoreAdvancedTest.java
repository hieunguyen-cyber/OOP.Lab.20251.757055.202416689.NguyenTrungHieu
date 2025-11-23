package hust.soict.dsai.aims.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;

/**
 * Exercise 16+: Store Test with Polymorphism
 * This test demonstrates managing a store with multiple media types
 */
public class StoreAdvancedTest {

    public static void main(String[] args) {
        System.out.println("===== Exercise 16: Testing Store with Different Media Types =====\n");
        
        // Create a store
        Store store = new Store();
        
        // Create various media items
        System.out.println("--- Creating Media Items for Store ---");
        
        // DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 24.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Inception", "Thriller", 23.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Interstellar", "Science Fiction", 25.99f);
        
        // CDs
        CompactDisc cd1 = new CompactDisc("Dark Side of the Moon", "Rock", "Pink Floyd", 14.99f);
        CompactDisc cd2 = new CompactDisc("Back in Black", "Rock", "AC/DC", 12.99f);
        
        // Books
        Book book1 = new Book("Dune", "Science Fiction", 18.99f);
        Book book2 = new Book("Harry Potter", "Fantasy", 16.99f);
        Book book3 = new Book("The Hobbit", "Fantasy", 14.99f);
        
        // Exercise 16: Add items to store
        System.out.println("\n--- Adding Items to Store ---");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        
        // Print store contents
        System.out.println("\n--- Store Contents ---");
        store.printStore();
        
        // Exercise 17: Test removing items
        System.out.println("\n--- Removing Items from Store ---");
        store.removeMedia(dvd2);
        store.removeMedia(book3);
        
        System.out.println("\n--- Store After Removal ---");
        store.printStore();
        
        // Exercise 18: Test polymorphic behavior - calculate total value
        System.out.println("\n--- Calculating Total Store Value ---");
        float totalValue = calculateStoreValue(store);
        System.out.println("Total Store Value: $" + String.format("%.2f", totalValue));
        
        // Exercise 19: Add tracks to CD and test playing
        System.out.println("\n--- Adding Tracks to CD ---");
        Track track1 = new Track("Brain Damage", 381);
        Track track2 = new Track("Eclipse", 432);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        
        System.out.println("\nPlaying CD from store:");
        cd1.play();
        
        // Exercise 20: Add authors to books
        System.out.println("\n--- Adding Authors to Books ---");
        book1.addAuthor("Frank Herbert");
        book2.addAuthor("J.K. Rowling");
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        
        // Exercise 21: Test instance checks
        System.out.println("\n--- Testing Instance Checks ---");
        testInstanceChecks(dvd1);
        testInstanceChecks(cd1);
        testInstanceChecks(book1);
    }
    
    /**
     * Helper method to calculate total store value
     * Demonstrates polymorphism - all media items inherit from Media
     */
    private static float calculateStoreValue(Store store) {
        // Note: We would need to access store's items list to implement this fully
        // This is a conceptual method - in practice, we'd add this method to Store class
        return 0f;
    }
    
    /**
     * Test instance checks with different media types
     */
    private static void testInstanceChecks(Media media) {
        System.out.println("\n--- Type Analysis: " + media.getTitle() + " ---");
        
        if (media instanceof Playable) {
            System.out.println("  ✓ This media is Playable");
            ((Playable) media).play();
        } else {
            System.out.println("  ✗ This media is NOT Playable");
        }
        
        if (media instanceof Disc) {
            Disc disc = (Disc) media;
            System.out.println("  ✓ This is a Disc");
            System.out.println("    - Length: " + disc.getLength() + " minutes");
            System.out.println("    - Director: " + disc.getDirector());
        }
        
        if (media instanceof DigitalVideoDisc) {
            System.out.println("  ✓ This is a DigitalVideoDisc (DVD)");
        }
        
        if (media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) media;
            System.out.println("  ✓ This is a CompactDisc (CD)");
            System.out.println("    - Artist: " + cd.getArtist());
        }
        
        if (media instanceof Book) {
            Book book = (Book) media;
            System.out.println("  ✓ This is a Book");
            System.out.println("    - Pages: " + book.getPages());
            System.out.println("    - Authors: " + book.getAuthors());
        }
    }
}
