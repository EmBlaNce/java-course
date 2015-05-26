package lekciq9;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in, "UTF-8");
		String text = null;
		int count = 0;
		
		System.out.print("Enter formula : ");
		text = scan.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				
				count++;
			} 
			else {
				
				if (text.charAt(i) == ')') {
				
					count--;
				}
			}
		}
		
		System.out.println("You entered: \n" + text);
		System.out.println("\n Wrong placement of brackets - " + (count != 0)); //stava i s dva if-a
		scan.close();
	}

}
