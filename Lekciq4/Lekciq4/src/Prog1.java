import java.util.Scanner;


public class Prog1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter n: ");
        int n = input.nextInt(); 
        
        input.close();
        
        for(int i = 1; i < n; i++){
        	System.out.println(i);
        }

	}

}