import java.util.Scanner;


public class Prog10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);   
		System.out.println("Enter the size of matrix :");
		int n=input.nextInt();
		int a[][]=new int[n][n];
		
		int b, c, d, e, f, g, h;
		b = n - 1;
		c = 0;    
		for(d = 0; d <= (n+1)/2; d++){ // my head is going to hurt real bad :( 
			
			for(e = d; e <= b; e++)   
			
				a[d][e] = ++c;
				
			for(f=d+1;f<=b;f++)   
			
				a[f][b] = ++c;
	 
				
			for(h= b-1; h>=d; h--)    
				a[b][h] = ++c;
	 
			
			for(g = b-1; g>d; g--)  
				a[g][d] = ++c;
	 
				b--;            
			}
	 
		
		for(d=0; d<n; d++)
		{
		
			for(e=0; e<n; e++)
			
				System.out.print(a[d][e]+"\t");
				
				System.out.println();
		}
		input.close();

	}

}