import java.util.Scanner;


public class Prog3 {


	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter n: ");
        int n = input.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= n; i++){
        	System.out.println("Enter number: " + " " + i);
        	int current = input.nextInt();
        	
        	if(current > max){
        		max = current;
        	}
        	
        	if(current < min){
        		min = current;
        	}

        }
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
       
        input.close();
	}

}