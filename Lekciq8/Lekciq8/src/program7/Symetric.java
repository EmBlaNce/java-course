package program7;

public class Symetric {
	public static void main(String[] args) {
		
		printSymmetric();
	}
	
	public static final void printSymmetric() {
		
		String number = null;
		for (int i = 10; i <= 999; i++) {
			
			number = Integer.toString(i);
			
			if (number.length() == 2) {
				
				if (number.charAt(0) == number.charAt(1)) {
					
					System.out.println(number);
					continue;
				}
			}
			if (number.length() == 3) {
				
				if (number.charAt(0) == number.charAt(2)) {
					System.out.println(number);
				}
			}
		}
	}

}