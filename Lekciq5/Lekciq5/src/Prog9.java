import java.util.Scanner;


public class Prog9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in ,"UTF-8");

		System.out.println("Enter size of massive: ");
		int size = input.nextInt();
		
		int[][] massive= new int[size][size];
		int q = 1;
		
		for(int i=0;i<size;i++){
			
			for(int k=0;k<size;k++){
				
				massive[i][k]=q;
				
				q++;
			}
		}
		
		for(int m=0;m<size;m++){
			
			for(int n=0;n<size;n++){
				
				System.out.print(massive[m][n]+" ");
			}
			System.out.println();
		}
		input.close();

	}

}