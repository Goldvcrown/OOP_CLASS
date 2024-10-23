package Aims;
public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	public String addDigitalVideoDisc(DigitalVideoDisc disc) throws ArithmeticException {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			throw new ArithmeticException("The cart is almost full!");
		}else{
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			return (disc.getTitle() + " has been added!");
		}
		
	}
	 public String removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemOrdered[i].getTitle().equalsIgnoreCase(disc.getTitle())) {
	                found = true;
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemOrdered[j] = itemOrdered[j + 1];
	                }
	                itemOrdered[qtyOrdered - 1] = null;
	                qtyOrdered--;
	                return (disc.getTitle() + " has been removed.");
	                
	            }
	        }
	        if (!found) {
	            return (disc.getTitle() + " not found.");
	        }
			return null;
	    }
	 public float totalCost() {
		 float res = 0;
		 for (int i = 0; i < qtyOrdered; i++) {
			 res += itemOrdered[i].getCost();
		 }
		 return res;
	 }
	 
	 
}


