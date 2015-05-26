package program9;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		int num = 0;
		StringBuilder firstPermutation = new StringBuilder();
		
		System.out.print("Enter a number: ");
		num = scanner.nextInt();
		
		if (num < 1) {
			
			System.out.println("Enter a number > 0 ");
			scanner.close();
			return;
		}
		
		for (int i = 1; i <= num; i++) {
			
			firstPermutation.append(i);
		}
		
		permutation("", firstPermutation.toString());
		scanner.close();
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		
		
		if (n == 0){
			
			System.out.println(prefix);
		}
		else {
			for (int i = 0; i < n; i++){
			
				permutation(prefix + str.charAt(i),
				str.substring(0, i) + str.substring(i + 1));
			}
		}
	}

}
