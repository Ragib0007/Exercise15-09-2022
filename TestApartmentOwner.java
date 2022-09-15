package com.sort.pll;
import com.sort.pll.ApartmentOwner;

public class TestApartmentOwner {
	public static void main(String[] args) {
		System.out.println("*****************");
		ApartmentOwner apart = new ApartmentOwner("Mr. Jhodan");//creating obj apart
		//we assign  values using set methods
		apart.setApartment("BEST Apartments, 29", 0);
		apart.setApartment("Dhatri Meadows - Builders and Developers, 42", 1);
		apart.setApartment("Karle Zenith Residences, 9", 2);
		apart.setApartment("Prestige City Sarjapur, 30", 5);
		apart.setApartment("Godrej Ananda, 2500", 8);
		
		System.out.println(apart);
		
		System.out.println();
		
		System.out.println(apart.getOwner() + " has " + apart.countApartments() + " apartments");
		//return total apartments
	
		System.out.println("Apartment 2: " + apart.getApartment(4));// Display 4th apartment
		
		System.out.println();
		apart.reorganizeApartments();
		System.out.println(apart);//Display all apartments details
		System.out.println("*****************");
	}
	
		
}
