package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class Aims {

	public static void main(String[] args) {
		// Create a new cart
		Cart anOrder = new Cart();
				
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation","Roger Allers", 19.95f);
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction","George Lucas", 24.95f);
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
				"Animation", 18.99f);
		anOrder.addMedia(dvd3);
				
		// Print out total cost of the items in the cart
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());	
		
		// Test out remove method
		anOrder.removeMedia(dvd3);
		System.out.print("Total Cost after removing Aladdin: ");
		System.out.println(anOrder.totalCost());
		
		// Print cart contents
		System.out.println("\n");
		anOrder.printCart();
	}
}

