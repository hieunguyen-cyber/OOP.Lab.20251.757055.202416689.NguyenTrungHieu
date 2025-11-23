package hust.soict.dsai.aims.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

/**
 * Exercise 10+: Advanced Cart Testing with Polymorphism
 * This test demonstrates polymorphism and inheritance concepts
 */
public class CartAdvancedTest {

    public static void main(String[] args) {
        System.out.println("===== Exercise 10: Testing Polymorphism with Different Media Types =====\n");
        
        // Create a cart
        Cart cart = new Cart();
        
        // Exercise 10: Create and add different types of media (Polymorphism)
        // Creating DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        
        // Creating CompactDisc objects
        CompactDisc cd1 = new CompactDisc("Abbey Road", "Rock", "The Beatles", 9.99f);
        CompactDisc cd2 = new CompactDisc("Thriller", "Pop", "Michael Jackson", 8.99f);
        
        // Creating Book objects
        Book book1 = new Book("1984", "Fiction", 15.99f);
        Book book2 = new Book("The Great Gatsby", "Fiction", 12.99f);
        
        // Exercise 10: Add all items to cart using polymorphism
        System.out.println("--- Adding Items to Cart ---");
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(cd1);
        cart.addMedia(cd2);
        cart.addMedia(book1);
        cart.addMedia(book2);
        
        System.out.println("\n--- Cart Contents (Polymorphic toString) ---");
        cart.printCart();
        
        System.out.println("\n--- Testing PlayableMedia ---");
        // Exercise 11: Play different media types (Polymorphism with interface)
        playMedia(dvd1);
        playMedia(cd1);
        playMedia(new Track("Bohemian Rhapsody", 354));
        
        System.out.println("\n--- Testing Polymorphic Casting and instanceof ---");
        // Exercise 12: Using instanceof to determine type
        checkMediaTypeByInstance(dvd1);
        checkMediaTypeByInstance(cd1);
        checkMediaTypeByInstance(book1);
        checkTrackType(new Track("Song", 200));
        
        System.out.println("\n--- Adding Books with Authors ---");
        // Exercise 13: Books with authors
        book1.addAuthor("George Orwell");
        book2.addAuthor("F. Scott Fitzgerald");
        System.out.println("Book 1: " + book1.toString());
        System.out.println("Book 2: " + book2.toString());
        
        System.out.println("\n--- Testing Tracks in CompactDisc ---");
        // Exercise 14: Tracks in CD
        Track track1 = new Track("Come Together", 259);
        Track track2 = new Track("Something", 183);
        Track track3 = new Track("Here Comes the Sun", 185);
        
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track3);
        
        System.out.println("\nPlaying CD with tracks:");
        cd1.play();
        
        System.out.println("\n--- Search Functionality ---");
        // Exercise 15: Search by ID and Title
        System.out.println("Searching for title 'Star Wars':");
        cart.searchByTitle("Star Wars");
        
        System.out.println("\nSearching for title 'Not in cart':");
        cart.searchByTitle("Not in cart");
        
        System.out.println("\n--- Remove Items ---");
        cart.removeMedia(dvd3);
        System.out.println("\nAfter removing Aladdin:");
        cart.printCart();
        
        System.out.println("\n--- Total Cost Calculation ---");
        System.out.println("Total cost of cart: $" + cart.totalCost());
    }
    
    /**
     * Exercise 11: Polymorphic method - accepts any Playable
     */
    public static void playMedia(Playable media) {
        System.out.println("\n--- Playing Media ---");
        media.play();
    }
    
    /**
     * Exercise 12: Polymorphic method with instanceof checks
     */
    public static void checkMediaTypeByInstance(Media media) {
        System.out.println("\nChecking type of: " + media.getClass().getSimpleName());
        
        if (media instanceof DigitalVideoDisc) {
            System.out.println("  -> This is a DVD");
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            System.out.println("  -> Director: " + dvd.getDirector());
        } else if (media instanceof CompactDisc) {
            System.out.println("  -> This is a CD");
            CompactDisc cd = (CompactDisc) media;
            System.out.println("  -> Artist: " + cd.getArtist());
        } else if (media instanceof Book) {
            System.out.println("  -> This is a Book");
            Book book = (Book) media;
            System.out.println("  -> Pages: " + book.getPages());
        }
    }
    
    /**
     * Check Track type
     */
    public static void checkTrackType(Track track) {
        System.out.println("\nThis is a Track: " + track.getTitle() + " (" + track.getLength() + "s)");
    }
}
