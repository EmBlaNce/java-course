
public class ori {

	public static void main(String[] args) {
		

		Car[] arr = new Car[10];
		arr[0] = new Automobile(1024, 3);
		
		arr[1] = new Automobile(2048, 4);
		
		arr[2] = new Automobile(4096, 5);
		
		arr[3] = new Automobile(8192, 6);
		
		arr[4] = new Automobile(16384, 7);
		
		arr[5] = new SUV(32767, true);
		
		arr[6] = new SUV(16385, false);
		
		arr[7] = new SUV(65535, true);
		
		arr[8] = new SUV(33333, false);
		
		arr[9] = new SUV(8700, false);
		
		for(int i = 0; i < 5; i++){
			
			arr[i].Say();
			
			arr[i].sayFuel();
		}
		
		for(int i = 5; i < 10; i++){
			
			arr[i].Say();
			
			arr[i].sayHigh();
		}
		
		for(int i = 0; i < 10; i++){
			
			for (int j = 0; j < arr.length - 1; j++)
            
			{
                if (arr[j].price > arr[j + 1].price) 
                {
            
                	int tmp = arr[j].price;
                	arr[j].price = arr[j + 1].price;
                    arr[j + 1].price = tmp;
                }
            }
		}

		for (int i = 0; i < arr.length; i++) {
			
           System.out.print(arr[i].price + " ");
        }
	}

}