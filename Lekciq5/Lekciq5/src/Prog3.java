import java.util.Scanner;


public class Prog3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in, "UTF-8");
		int num = 10;
		int[]arr = new int[num];
		System.out.println("Enter 10 numbers: ");
		int i;
		
		for(i=0; i<num; i++){
			arr[i] = input.nextInt();
		}
		
		for(i=0; i<num;i++){
			arr[i] *= 10;
		}
		
		for(i=0; i<num; i++){
			System.out.print(arr[i] +" ");
		}
		
		input.close();
	}
}