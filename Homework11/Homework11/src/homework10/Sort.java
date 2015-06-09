package homework10;

public class Sort {
	
	private int array[];
	private int length;

	public void qsort(int[] inputArr) {
		
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		
		int i = lowerIndex;
		int j = higherIndex;
		int middle = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {
			while (array[i] < middle) {
				i++;
			}
			while (array[j] > middle) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void bsort(int []inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		bubbleSort(inputArr);
	}
	
	private void bubbleSort(int []inputArr) {
		boolean flag = true;
		int temp = 0;
		while (flag) {
			flag = false;
			for (int i = 0; i < inputArr.length - 1; i++) {
				if (inputArr[i] > inputArr[i + 1]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[i + 1];
					inputArr[i + 1] = temp;
					flag = true;
				}
			}
		}
	}
}