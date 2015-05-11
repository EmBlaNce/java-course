import java.util.Scanner;


public class Prog2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number one: ");
		int number1 = input.nextInt();
        
        System.out.println("Enter number two: ");
        int number2 = input.nextInt();
        
        System.out.println("Enter number three: ");
        int number3 = input.nextInt();
        int max = number1;
        
        if(max < number2){
        	max = number2;
        }
        if(max < number3){
        	max = number3;
        }
        System.out.println("The biggest number is : "+max );
        input.close();
	}

}
