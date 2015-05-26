package program2;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in, "UTF-8");
		
		int number = 0;
		
		System.out.print("Enter a number between 10 and 30000: ");
		number = scan.nextInt();
		
		if (number < 10 || number > 30000) {
			System.out.println("Enter a number between 10 and 30000!");
			scan.close();
			return;
		}
		
		System.out.println("Sum: " + Sum.getSum(number, 0));
		
		scan.close();
	}

}
