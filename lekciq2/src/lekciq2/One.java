package lekciq2;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in,"UTF-8");	
     
		System.out.println("Lenght of first wall : ");
		
		double a=input.nextDouble();
		
		System.out.println("Lenght of second wall : ");
		
		double b=input.nextDouble();
		
		System.out.println("Area is : " +(b*a)); // 
     
     input.close();
	}

}