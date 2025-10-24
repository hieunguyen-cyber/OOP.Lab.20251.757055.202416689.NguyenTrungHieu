package default_package;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc itemsOrdered[]=
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full! Cannot add more discs.");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added to the cart.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
                System.out.println("The cart is almost full.");
            }
        }
    }

	// public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
	//    int n = dvdList.length;
	//    if (qtyOrdered + n <= MAX_NUMBERS_ORDERED){
	// 		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++){
	// 			for (int j = 0; j < n; j++){
	// 				if (itemsOrdered[i] == null){
	// 					itemsOrdered[i] = dvdList[j];
	// 				}
	// 			}
	// 		} return true;
	// 	} else {return false;}
	//}

	public boolean addDigitalVideoDisc(DigitalVideoDisc... discs){
		int n = discs.length;
		boolean place[] = new boolean[n];
		if (qtyOrdered + n <= MAX_NUMBERS_ORDERED){
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++){
				for (int j = 0; j < n; j++){
					if ((itemsOrdered[i] == null) && (!place[j])){
						itemsOrdered[i] = discs[j];
						place[j] = true;
					}
				}
			} return true;
		} else {
				return false;
			}
	}
    
    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
            return true;
        } else {
            System.out.println("Not enough space in the cart to add two discs.");
            return false;
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }
  
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println((i + 1) + ". DVD - " + disc.toString());
            totalCost += disc.getCost();
        }

        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        System.out.println("Searching for DVD with ID: " + id);

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isIdMatch(id)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
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
        System.out.println("Searching for DVD with title: \"" + title + "\"");

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isTitleMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found for title: \"" + title + "\"");
        }
    }
}
