package program3;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in, "UTF-8");
		int a = 0, b = 0, c = 0;
		
		System.out.print("Enter first number : ");
		a = scan.nextInt();
		
		System.out.print("Enter second number : ");
		scan.nextLine();
		b = scan.nextInt();
		
		System.out.print("Enter third number : ");
		scan.nextLine();
		c = scan.nextInt();
		
		System.out.println("The biggest number is: " + (c > maxNumber(a, b) ? c : maxNumber(a, b)));
	}
	
	public static final int maxNumber(int a, int b) {
		if (a > b) {
			
			return a;
		} 
		else {
			
			return b;
		}
	}

}