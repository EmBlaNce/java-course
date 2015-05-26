package program1;

public abstract class Reverse {

	public static final void reverseArray(int[] arr) {
		
		for (int i = arr.length - 1 ; i >= 0; i--) {
		
			System.out.print(arr[i] + " ");
		}
	}
	
	public static final void reverseArray(char[] arr) {
		
		for (int i = arr.length - 1; i >= 0; i--) {
		
			System.out.print(arr[i] + " ");
		}
	}
}
