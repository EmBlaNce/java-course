
public class Car {
	public int price;
	
	public Car(){
		this.price = 0;
		
		}
		
		public Car(int price){
			this();
			
			setPrice(price);
			
		}
		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
		public void Say(){
			System.out.println("The price of the car is" + " " + this.price + ".");
		}

		public void sayFuel() {
			
			
		}

		public void sayHigh() {
			
			
		}

}