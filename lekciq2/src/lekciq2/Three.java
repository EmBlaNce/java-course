package lekciq2;
import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in,"UTF-8");
		Scanner reader = new Scanner(System.in);
		System.out.println("Name|Surname|Years|Gender|ID|Telephone");
		
		System.out.println("Enter First name:");
		String name=input.nextLine();

		System.out.println("Enter Surname:");
		String Surname=input.nextLine();
		
		System.out.println("Enter years:");
		int years = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter gender: ");
		char gender=reader.next().charAt(0); 
		
		System.out.println("Enter ID: ");
		long ID=input.nextLong();
		
		System.out.println("Enter Telephone: ");
		String phone=input.nextLine(); 
		
		System.out.println("Persons name is:  " +name +" Surname is:  " +Surname +" Years are:  " +years +" Gender is:  " +gender +" ID is:  " +ID +" The phone number is: " +phone);
		input.close();
	}

}