package lekciq9;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in, "UTF-8");
		String word = null, text = null;
		
		System.out.print("Enter random text: ");
		text = scan.nextLine();
		
		System.out.print("Enter a word: ");
		word = scan.nextLine();
		
		
		if (!text.contains(word)) {
			
			System.out.println("Your text does not contain the word \"" + word + "\"");
		} 
		else {
			
			text = text.replace(word, word.toUpperCase());
			System.out.println("Your word \"" + word + "\" in text is in uppercase:\n" + text);
		}
		
		scan.close();
	}
}