package default_package;

public class Store {
    public static final int MAX_ITEMS = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0;

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                qtyInStore--;
                itemsInStore[qtyInStore] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The disc \"" + disc.getTitle() + "\" is not found in the store.");
        }
    }

    // Display all DVDs in the store
    public void printStore() {
        System.out.println("***********************STORE***********************");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}