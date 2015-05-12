import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		
		 System.out.println("Which number to search for: ");
		 int num = input.nextInt();
		  int[] mass = {3,4,5,25,31,45,16,7,5,34,38,1,13,5,7,11,9,8,91,82,73,66,44,55,33};
		  int flag = 0;
		  
		  for(int i=0; i<mass.length; i++){
			  
			  if(mass[i] == num){
				  System.out.println("The index is: "+i);
				
				  flag = 1;
				  break;
			  }
		  }
		  
		  if(flag == 0){
			  
			  System.out.println("No such number. ");  
		  }
		  input.close();
	}
}