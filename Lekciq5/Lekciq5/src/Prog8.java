import java.util.Random;


public class Prog8 {
   
	public static void main(String a[]) {
    int i;



    int[] array = new int[15];
    Random random = new Random();

    for (int k = 0; k < array.length; k++)
    	
        array[k] = random.nextInt(array.length) + 1;
    
    	System.out.println("Values Before the sort:\n");
    
    	for (i = 0; i < array.length; i++)
    		System.out.print(array[i] + "  ");
    		System.out.println();
    		bubble_srt(array, array.length);
    		System.out.print("Values after the sort:\n");
    		
    	
    for (i = 0; i < array.length; i++)
        System.out.print(array[i] + "  ");
        System.out.println();
        


}

	public static void bubble_srt(int a[], int n) {
	    int i, q, p = 0;
	   
	    for (i = 0; i < n; i++) {
	        
	    	for (q = 1; q < (n - i); q++) {
	           
	    		if (a[q - 1] > a[q]) {
	              
	    			p = a[q - 1];
	                
	    			a[q - 1] = a[q];
	                
	    			a[q] = p;
	            }
	        }
	    }
	}
	}