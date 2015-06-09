package prog2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		HashSet<String> deck = new HashSet<String>();
		HashMap<String, Integer> MyDeck = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in, "UTF-8");
		String card = null;
		
		populateSet(deck);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter type of card : ");
			card = scan.nextLine();
			if (!deck.contains(card)) {
				System.out.println("Wrong input type of card entered!");
			} else {
				count(MyDeck, card);
			}
		}
		printResult(MyDeck);
		scan.close();
	}

	public static void populateSet(HashSet<String> deck) {
		
		for (int i = 2; i <= 10; i++) {
			deck.add(Integer.toString(i));
		}
		
		deck.add("J");
		deck.add("Q");
		deck.add("K");
		deck.add("A");
	}
	
	public static void count(HashMap<String, Integer> MyDeck, String card) {
		if (MyDeck.containsKey(card)) {
			
			int count = MyDeck.get(card);
			count++;
			MyDeck.replace(card, count);
		}
		
		else {
			MyDeck.put(card, 1);
		}
	}
	
	public static void printResult(HashMap<String, Integer> MyDeck) {
		System.out.println();
		int count = -1;
		
		for (Object key : MyDeck.keySet()) {
			
			if (MyDeck.get(key) > count) {
				
				count = MyDeck.get(key);
			}
		}
		switch (count) {
		case 1: 
			System.out.println("No match!");
		case 2:
			System.out.println("Pair.");
			break;
		case 3:
			System.out.println("Three of a kind");
			break;
		case 4:
			System.out.println("Four of a kind");
			break;
		case 5:
			System.out.println("Impossible combination!");
		}
	}
}