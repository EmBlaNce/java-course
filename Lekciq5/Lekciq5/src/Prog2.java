import java.util.Scanner;


public class Prog2 {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in, "UTF-8");
		System.out.println("Enter the limit of array: ");
		int k=input.nextInt();
		int i=0;
		int[]arr=new int[k+1];
			arr[1]=1;
			
		for(i=2;i<k+1;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(i=1;i<k+1;i++){
			System.out.println(arr[i]);
		}
		input.close();
	}
}