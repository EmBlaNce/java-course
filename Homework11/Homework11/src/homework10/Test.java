package homework10;

public class Test {

	public static void main(String[] args) {
		Sort sorter = new Sort();
		int size = 1000000;
		int[] array1 = new int[size], array2 = new int[size];
		long startTime = 0, endTime = 0;
		double result = 0;
		
		for (int i = 0; i < size; i++) {
			array1[i] = array2[i] = size - i;
		}
		
		startTime = System.nanoTime();
		sorter.qsort(array1);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Quick sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.bsort(array2);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Bubble sort time: " + result + " s");
	}

}