
public class Convert {

	
	double fahren;
	
	public Convert(){
		
		this.fahren=0;
	}
	public Convert(double Celsius){
		this();
		this.fahren = (9.0/5.0)* Celsius + 32;
		
	}
	void print(){
		System.out.println("Temperature in Fahrenheit :" +fahren);
	}
}