package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
        	itemsOrdered[qtyOrdered] = disc;
        	qtyOrdered++;
        } else {
            System.out.println("ERROR: the cart is full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
    	for (int i = 0; i < dvdList.length; i++) {
    		this.addDigitalVideoDisc(dvdList[i]);
    	}
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc...dvdList) {
//    	this.addDigitalVideoDisc(dvdList[i]);
//    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean isfound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc.equals(itemsOrdered[i])) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                isfound = true;
                break;
            }
        }
        if (!isfound) {
            System.out.println("ERROR: the disc is not in the cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void print() {
    	System.out.println("***********************CART***********************");
    	for (int i = 0; i < qtyOrdered; i++) {
    		System.out.println(itemsOrdered[i].toString());
    	}
    	System.out.println("Total cost: " + totalCost());
    }
    public void Search(String title) {
    	for (int  i = 0; i < qtyOrdered; i++) {
    		if (itemsOrdered[i].isMatch(title)) {
    			System.out.println(itemsOrdered[i].toString());
    		}
    	}
    }
    
    public void Search(int Id) {
    	for (int  i = 0; i < qtyOrdered; i++) {
    		if (itemsOrdered[i].isMatch(Id)) {
    			System.out.println(itemsOrdered[i].toString());
    		}
    	}
    }
}