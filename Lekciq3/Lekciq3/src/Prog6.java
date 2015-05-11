import java.util.Scanner;


public class Prog6 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter card: ");
		String card=input.nextLine();

		if(card.equals("2")||card.equals("3")||card.equals("4")||card.equals("5")||card.equals("6")||
				card.equals("7")||card.equals("8")||card.equals("9")||card.equals("10")||
				card.equals("J")||card.equals("Q")||card.equals("K")||card.equals("A")){
			System.out.println("Valid card!");
		}
		else{
			System.out.println("Invalid card!");
		}
	input.close();
	}
}
