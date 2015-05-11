import java.util.Scanner;


public class Prog4 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter n: ");
        int n = input.nextInt();
        
        System.out.println("Please enter k: ");
        int k = input.nextInt();
        
        input.close();

        int p = 1;
        int q = 1;
        
        if(1 < k && k < n){
        	for(int i = 1; i <= k; i++){
        		p *= i;
        	}
        	for(int a = 1; a <= n; a++){
        		q *= a;
        	}
        	
        	int c = q / p;
        	System.out.println("n!/k!= " + c);
        }
        else{
        	System.out.println("Try with different numbers ");
        }

	}

}