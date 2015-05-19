public class SUV extends Car {

	public boolean high;
	
	public SUV(){
		super();
		this.high = true;
	}
	
	public SUV(int price, boolean high){
		super(price);
		
		setHigh(high);
	}

	public boolean getHigh() {
		return high;
	}

	public void setHigh(boolean high) {
		this.high = high;
	}
	
	public void sayHigh(){
		System.out.println("The SUV is offroad -  " + " " + this.high + ".");
	}
}