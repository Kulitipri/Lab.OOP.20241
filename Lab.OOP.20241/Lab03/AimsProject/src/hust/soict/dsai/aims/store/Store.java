package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public DigitalVideoDisc []itemsInStore = new DigitalVideoDisc[10000] ;
	private int qtyOrdered = 0;
	public void addDvd(DigitalVideoDisc disc) {
		if (qtyOrdered < 10000) {
			itemsInStore[qtyOrdered] = disc;
        	qtyOrdered++;
        	System.out.println("The disc is added to the store successfully");
        } else {
            System.out.println("ERROR: the store is full");
        }
	}
	public void removeDvd(DigitalVideoDisc disc) {
        boolean isfound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc.equals(itemsInStore[i])) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                	itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyOrdered - 1] = null;
                qtyOrdered--;
                isfound = true;
                System.out.println("Remove disc successfully");
                break;
            }
        }
        if (!isfound) {
            System.out.println("ERROR: the disc is not in the store");
        }
	}
}
