package homework10;

import java.util.Arrays;

public class BucketSort {

	public static void sort(int[] array) {
		int maxValue = getMaxValue(array);
		int[] bucket = new int[maxValue + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				array[outPos++] = i;
			}
		}
	}

	private static int getMaxValue(int[] arr) {
		
		int maxValue = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
		
			if (arr[i] > maxValue) {
			
				maxValue += arr[i];
			}
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		int[] array = { 33, 12, 43, 10, 9, 5, 66, 89, 92, 83, 15 };

		System.out.println("Before: " + Arrays.toString(array));
		sort(array);
		System.out.println("After:  " + Arrays.toString(array));
	}

}