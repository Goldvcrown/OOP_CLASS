package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class TestPassingParameter {

	public static void main(String[] args) {
	//old
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
	        
	        swap(jungleDVD, cinderellaDVD);
	        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	//new
	        DigitalVideoDiscWrapper wjungleDVD = new DigitalVideoDiscWrapper(jungleDVD);
	        DigitalVideoDiscWrapper wcinderellaDVD = new DigitalVideoDiscWrapper(cinderellaDVD);
	                
	        swap(wjungleDVD, wcinderellaDVD);
	        System.out.println("Correct jungle dvd title: " + wjungleDVD.dvd.getTitle());
	        System.out.println("Correct cinderella dvd title: " + wcinderellaDVD.dvd.getTitle());
	        
	        
	        changeTitle(jungleDVD, cinderellaDVD.getTitle());
	        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}	 
//old swap
	public static void swap(Object o1, Object o2) {
	        Object tmp = o1;
	        o1 = o2;
	        o2 = tmp;
	    }
//new swap
	public static void swap(DigitalVideoDiscWrapper o1, DigitalVideoDiscWrapper o2) {
	        DigitalVideoDisc tmp = o1.dvd;
	        o1.dvd = o2.dvd;
	        o2.dvd = tmp;
	    }

	    
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
	        String oldTitle = dvd.getTitle();
	        dvd.setTitle(title);
	        dvd = new DigitalVideoDisc(oldTitle);
	    }


}	  

