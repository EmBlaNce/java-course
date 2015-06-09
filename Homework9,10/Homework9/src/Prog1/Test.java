package Prog1;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Town> towns = new HashSet<Town>();

		for (int i = 0; i < 5; i++) {
			
			towns.add(new Town("Town " + Integer.toString(i), "Country", (100 + i) * (i + 1)));
		}

		Town varna = new Town("Varna", "Bulgaria", 330000);
		towns.add(varna);
		
		System.out.println("Does it contain \"Varna\" ? : " + towns.contains(varna));
		towns.remove(varna);
		
		System.out.println("Does it contain \"Varna\" ? : " + towns.contains(varna));
	}

}