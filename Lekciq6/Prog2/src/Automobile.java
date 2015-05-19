public class Automobile extends Car {
	public int fuel;
	
	public Automobile(){
		super();
		this.fuel = 0;
	}
	
	public Automobile(int price, int fuel){
		super(price);
		
		setFuel(fuel);
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	public void sayFuel(){
		System.out.println("The car uses " + this.fuel + " litters of fuel.");
	}

}