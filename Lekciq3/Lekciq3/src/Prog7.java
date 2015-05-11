import java.util.Scanner;


public class Prog7 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a: ");
        int a = input.nextInt();
        
        System.out.println("Please enter b: ");
        int b = input.nextInt();
        
        System.out.println("Please enter c: ");
        int c = input.nextInt();
        
        input.close();
        
        double d = ((int) Math.pow(b,2)) - (4 * a * c);
        
        if(d < 0){
        	System.out.println("It's < 0.");
        }
        else{
        	double x1 = (-b + Math.sqrt(d))/(2 * a);
        
        	double x2 = (-b - Math.sqrt(d))/(2 * a);
        
        
        	System.out.println("x1 is: " + x1);
        
        	System.out.println("x2 is: " + x2);
        }

	}
}
