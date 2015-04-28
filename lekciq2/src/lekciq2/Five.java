package lekciq2;
import java.util.Scanner;

public class Five {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter first number:");
		int a=input.nextInt();
		
		System.out.println("Enter second number:");
		int b=input.nextInt();
		
		System.out.println("Enter third number :");
		int c=input.nextInt();
		
		System.out.println("Enter fourth number: ");
		int d=input.nextInt();
		
		System.out.println("The sum is : " +(a+b+c+d));
		input.close();
	}

}