import java.util.Scanner;


public class Prog9 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter number: ");
        String number=input.nextLine();
      
        int i=number.length();
        if(i==3){
        	
        	if(number.charAt(0)=='1'){
        		System.out.print("one hundred ");
        	}
        	if(number.charAt(0)=='2'){
        		System.out.print("two hundred ");
        	}
        	if(number.charAt(0)=='3'){
        		System.out.print("three hundred ");
        	}
        	if(number.charAt(0)=='4'){
        		System.out.print("four hundred ");
        	}
        	if(number.charAt(0)=='5'){
        		System.out.print("five hundred ");
        	}
        	if(number.charAt(0)=='6'){
        		System.out.print("six hundred ");
        	}
        	if(number.charAt(0)=='7'){
        		System.out.print("seven hundred ");
        	}
        	if(number.charAt(0)=='8'){
        		System.out.print("eight hundred ");
        	}
        	if(number.charAt(0)=='9'){
        		System.out.print("nine hundred ");
        	}
        	if(number.charAt(1)=='0'){
        		
        		if(number.charAt(2)=='0'){
        			System.exit(1);
            	}
        		
        		if(number.charAt(2)=='1'){
            		System.out.print("and one");
            	}
            	if(number.charAt(2)=='2'){
            		System.out.print("and two");
            	}
            	if(number.charAt(2)=='3'){
            		System.out.print("and three");
            	}
            	if(number.charAt(2)=='4'){
            		System.out.print("and four");
            	}
            	if(number.charAt(2)=='5'){
            		System.out.print("and five");
            	}
            	if(number.charAt(2)=='6'){
            		System.out.print("and six");
            	}
            	if(number.charAt(2)=='7'){
            		System.out.print("and seven");
            	}
            	if(number.charAt(2)=='8'){
            		System.out.print("and eight");
            	}
            	if(number.charAt(2)=='9'){
            		System.out.print("and nine");
            	}
        		System.exit(1);
        	}
        	if(number.charAt(1)=='1'){
        		
        		if(number.charAt(2)=='0'){
            		System.out.print("and ten");
            	}
        		
        		if(number.charAt(2)=='1'){
            		System.out.print("eleven");
            	}
            	if(number.charAt(2)=='2'){
            		System.out.print("twelve");
            	}
            	if(number.charAt(2)=='3'){
            		System.out.print("thirteen");
            	}
            	if(number.charAt(2)=='4'){
            		System.out.print("fourteen");
            	}
            	if(number.charAt(2)=='5'){
            		System.out.print("fifteen");
            	}
            	if(number.charAt(2)=='6'){
            		System.out.print("sixteen");
            	}
            	if(number.charAt(2)=='7'){
            		System.out.print("seventeen");
            	}
            	if(number.charAt(2)=='8'){
            		System.out.print("eighteen");
            	}
            	if(number.charAt(2)=='9'){
            		System.out.print("nineteen");
            	}
        		System.exit(1);
        	}
        	if(number.charAt(1)=='2'){
        		System.out.print("twenty");
        		
        		if(number.charAt(2)=='0'){
        			System.exit(1);
            	}
        	}
        	if(number.charAt(1)=='3'){
        		System.out.print("thirty");
        	}
        	if(number.charAt(1)=='4'){
        		System.out.print("fourty");
        	}
        	if(number.charAt(1)=='5'){
        		System.out.print("fifty");
        	}
        	if(number.charAt(1)=='6'){
        		System.out.print("sixty");
        	}
        	if(number.charAt(1)=='7'){
        		System.out.print("seventy");
        	}
        	if(number.charAt(1)=='8'){
        		System.out.print("eighty");
        	}
        	if(number.charAt(1)=='9'){
        		System.out.print("ninty");
        	}
        	if(number.charAt(2)=='0'){
    			System.exit(1);
        	}
    		
    		if(number.charAt(2)=='1'){
        		System.out.print("-one");
        	}
        	if(number.charAt(2)=='2'){
        		System.out.print("-two");
        	}
        	if(number.charAt(2)=='3'){
        		System.out.print("-three");
        	}
        	if(number.charAt(2)=='4'){
        		System.out.print("-four");
        	}
        	if(number.charAt(2)=='5'){
        		System.out.print("-five");
        	}
        	if(number.charAt(2)=='6'){
        		System.out.print("-six");
        	}
        	if(number.charAt(2)=='7'){
        		System.out.print("-seven");
        	}
        	if(number.charAt(2)=='8'){
        		System.out.print("-eight");
        	}
        	if(number.charAt(2)=='9'){
        		System.out.print("-nine");
        	}
        
        }
        else if(i==2){
                 if(number.charAt(0)=='1'){
        		
        		if(number.charAt(1)=='0'){
            		System.out.print("and ten");
            	}
        		
        		if(number.charAt(1)=='1'){
            		System.out.print("eleven");
            	}
            	if(number.charAt(1)=='2'){
            		System.out.print("twelve");
            	}
            	if(number.charAt(1)=='3'){
            		System.out.print("thirteen");
            	}
            	if(number.charAt(1)=='4'){
            		System.out.print("fourteen");
            	}
            	if(number.charAt(1)=='5'){
            		System.out.print("fifteen");
            	}
            	if(number.charAt(1)=='6'){
            		System.out.print("sixteen");
            	}
            	if(number.charAt(1)=='7'){
            		System.out.print("seventeen");
            	}
            	if(number.charAt(1)=='8'){
            		System.out.print("eighteen");
            	}
            	if(number.charAt(1)=='9'){
            		System.out.print("nineteen");
            	}
        		System.exit(1);
        	}
        	if(number.charAt(0)=='2'){
        		System.out.print("twenty");
        		
        		if(number.charAt(1)=='0'){
        			System.exit(1);
            	}
        	}
        	if(number.charAt(0)=='3'){
        		System.out.print("thirty");
        	}
        	if(number.charAt(0)=='4'){
        		System.out.print("fourty");
        	}
        	if(number.charAt(0)=='5'){
        		System.out.print("fifty");
        	}
        	if(number.charAt(0)=='6'){
        		System.out.print("sixty");
        	}
        	if(number.charAt(0)=='7'){
        		System.out.print("seventy");
        	}
        	if(number.charAt(0)=='8'){
        		System.out.print("eighty");
        	}
        	if(number.charAt(0)=='9'){
        		System.out.print("ninty");
        	}
        	if(number.charAt(1)=='0'){
    			System.exit(1);
        	}
    		
    		if(number.charAt(1)=='1'){
        		System.out.print("-one");
        	}
        	if(number.charAt(1)=='2'){
        		System.out.print("-two");
        	}
        	if(number.charAt(1)=='3'){
        		System.out.print("-three");
        	}
        	if(number.charAt(1)=='4'){
        		System.out.print("-four");
        	}
        	if(number.charAt(1)=='5'){
        		System.out.print("-five");
        	}
        	if(number.charAt(1)=='6'){
        		System.out.print("-six");
        	}
        	if(number.charAt(1)=='7'){
        		System.out.print("-seven");
        	}
        	if(number.charAt(1)=='8'){
        		System.out.print("-eight");
        	}
        	if(number.charAt(1)=='9'){
        		System.out.print("-nine");
        	}
        }
        	
        else if(i==1){
        	if(number.charAt(0)=='0'){
        		System.out.print("zero");
        	}
        	if(number.charAt(0)=='1'){
        		System.out.print("one");
        	}
        	if(number.charAt(0)=='2'){
        		System.out.print("two");
        	}
        	if(number.charAt(0)=='3'){
        		System.out.print("three");
        	}
        	if(number.charAt(0)=='4'){
        		System.out.print("four");
        	}
        	if(number.charAt(0)=='5'){
        		System.out.print("five");
        	}
        	if(number.charAt(0)=='6'){
        		System.out.print("six");
        	}
        	if(number.charAt(0)=='7'){
        		System.out.print("seven");
        	}
        	if(number.charAt(0)=='8'){
        		System.out.print("eight");
        	}
        	if(number.charAt(0)=='9'){
        		System.out.print("nine");
        	}
        }
        input.close();
	}

}
