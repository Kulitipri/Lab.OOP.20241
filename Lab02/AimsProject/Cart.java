package App;

public class Cart {
	public static final int MAX_NUMBER_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]=
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is full.");
		}else {
			itemsOrdered[qtyOrdered++]=disc;
			System.out.println("The disc has been added.");
			
		}
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].equals(disc)) {
	            
	            for (int j = i; j < qtyOrdered - 1; j++) {
	                itemsOrdered[j] = itemsOrdered[j + 1];
	            }
	            itemsOrdered[qtyOrdered - 1] = null;
	            qtyOrdered--;
	            System.out.println("The disc has been removed.");
	            break;
	        }
	    }
	}
	public float totalCost() {
		float cost=0;
		for(int i=0;i< qtyOrdered;i++) {
			if (itemsOrdered[i]!=null) {
				cost+= itemsOrdered[i].getCost();
			}
		}
		return cost;
	}
}
