package lekciq2;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number: ");
		int number=input.nextInt();
		
		boolean num= 0==number%2;
		System.out.println("Even number -> "+ num);
			
		input.close();
	}
}