import java.util.Scanner;


public class Prog5 {


	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter first number :  ");
        int N = input.nextInt();
        
        System.out.println("Enter second number : ");
        int K = input.nextInt();
        
        input.close();

        int p = 1;
        int q = 1;
        int r = 1;

        	for(int i = 1; i <= K; i++){
        		p *= i;
        	}
        	for(int a = 1; a <= N; a++){
        		q *= a;
        	}
        	
        	int c = q * p;
        	
        	int z = N - K;
        	
        	for(int b = 1; b <= z; b++){
        		r *= b;
        	}
        	
        	int y = c / r;
        	
        	System.out.println("N!*K!/(N-K)!= " + y);

	}

}