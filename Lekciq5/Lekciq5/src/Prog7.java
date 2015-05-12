import java.util.Scanner;

public class Prog7 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in, "UTF-8");
    	
    	System.out.println("Count of numbers :  ");
        int count = input.nextInt();
        
        int[] array = new int[count];
        
        System.out.println("Please enter" + " " + count + " " + "numbers");
        
        for(int i = 0; i < count; i++){
        	array[i] = input.nextInt();
        }
        
        System.out.println("Enter number to search for: ");
        int num = input.nextInt();
        
        input.close();
        
        int first = 0;
        int last = count - 1;
        int mid = (first + last) / 2;
        
        while(first <= last){
        	if(array[mid] < num){
        		first = mid + 1;
        	}
        	else if(array[mid] == num){
        		System.out.println(mid + 1);
        		break;
        	}
        	else{
        		last = mid +1;
        	}
        	
        	mid = (first + last) / 2;
        }
        
        if(first > last){
        	System.out.println(num + " " + "is not found.");
        }
        input.close();
    }
 }