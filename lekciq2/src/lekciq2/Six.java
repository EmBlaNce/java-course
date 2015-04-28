package lekciq2;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		System.out.println("r: ");
		int r=input.nextInt();
		
		double P=(double)2*3.14*r;
		System.out.println("P =  : "+P);
		
		double S=(double)3.14*r*r;
		System.out.println("S=  : "+S);
		input.close();
	}

}