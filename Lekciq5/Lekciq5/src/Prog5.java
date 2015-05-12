import java.util.Scanner;


public class Prog5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Enter first number: ");
		 int a = input.nextInt();

		 System.out.println("Enter second number: ");
		 int b = input.nextInt();
		 
		 if(a > b){
			 
			 System.out.println("Error");
			 
			 System.exit(0);
		 }
		
		 for(int i=a;i<=b;i++){
			
			 if(i%3==0){
			
				 System.out.println(i);
			}
		 }
		 input.close();
	}

}