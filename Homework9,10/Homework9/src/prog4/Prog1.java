package prog4;

import java.util.Scanner;
import java.util.Stack;

public class Prog1 {

	public static void main(String[] args) {
		Stack<String> words = new Stack<String>();
		
		Scanner scan = new Scanner(System.in, "UTF-8");
		
		String sentence = null, word = null;
		
		System.out.println("Enter a sentence:");
		sentence = scan.nextLine();
		scan.close();
		scan = new Scanner(sentence);
		
		while (scan.hasNext()) {
			word = scan.next();
			words.push(word);
		}
		
		while (!words.isEmpty()) {
			
			System.out.print(words.pop() + " ");
		}
		scan.close();
	}

}