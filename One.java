package lekciq2;
import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
     Scanner input= new Scanner(System.in,"UTF-8");	
     System.out.println("Lenght of first wall : ");
     
     double a=input.nextDouble();
     System.out.println("Lenght of second wall : ");
     double b=input.nextDouble();
     
     System.out.println("Area :" +(b*a)); 
     input.close();
	}

}