public class Prog6 {
	public static void main(String[] args) {
	
	int[][] array = new int[5][6];
	int num = 30;
	
	for(int row = 0; row < 5; row++){
	
		for(int column = 0; column < 6; column++){
			
			array[row][column] = num;
			num--;
			System.out.print(array[row][column] + "\t");
		}
		System.out.println();
	}
	
} 
}