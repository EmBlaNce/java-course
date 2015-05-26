package program1;

public class Test {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		char[] charArr = new char[26];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
		
		}
		
		for (int i = 0; i < charArr.length; i++) {
			
			charArr[i] = (char) (65 + i);
		}
		
		Reverse.reverseArray(arr);
		
		System.out.println();
		
		Reverse.reverseArray(charArr);
	}
}
