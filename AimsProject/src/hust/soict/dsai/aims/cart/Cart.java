package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc)  {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full!");
		}else{
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println(disc.getTitle() + " has been added!");
		}
	}
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        if (dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemOrdered[qtyOrdered] = dvdList[i];
                System.out.println(dvdList[i].getTitle() + " has been added!");
                qtyOrdered +=1 ;
            }
    
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("Nothing to remove!");
        } else {
            int ind = -1;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemOrdered[i] == disc) {
                    ind = i;
                    break;
                }
            }
            if (ind == -1) {
                System.out.println("Disc not found in cart!");
            } else {
                for (int i = ind; i < qtyOrdered - 1; i++) {
                    itemOrdered[i] = itemOrdered[i + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(disc.getTitle() + " has been removed from the cart.");
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        DigitalVideoDisc [] dvdList = {dvd1, dvd2};
        addDigitalVideoDisc(dvdList);
    }
	public float totalCost() {
		 float res = 0;
		 for (int i = 0; i < qtyOrdered; i++) {
			 res += itemOrdered[i].getCost();
		 }
		 return res;
	}
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id) {
                System.out.println("Found" + itemOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no DVDs were found that match the ID provided!");
        }
    } 
    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(keyword)) {
                System.out.println("Found" + itemOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found with \"" + keyword +"\" in the title!");
        }
    }
	public void print() {
	     System.out.println("***********************CART***********************");
	     System.out.println("Ordered Items:");
	     for (int i = 0; i < qtyOrdered; i++) {
	         System.out.println(i+1 + ". " + itemOrdered[i]);
	     }
	     System.out.println("Total cost: " + totalCost());
	     System.out.println("***************************************************");
	     }	 
}


