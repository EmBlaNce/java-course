package prog4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		
		Queue<String> words = new LinkedList<String>();
		
		Scanner scan = new Scanner(System.in, "UTF-8");
		
		String sentence = null, word = null;
		
		System.out.println("Enter a sentence:");
		
		sentence = scan.nextLine();
		
		scan.close();
		
		scan = new Scanner(sentence);
		
		while (scan.hasNext()) {
			
			word = scan.next();
			
			if (word.length() >= 3) {
				words.offer(word);
			}
		}
		
		while (!words.isEmpty()) {
			
			System.out.print(words.poll() + " ");
		}
		scan.close();
	}

}