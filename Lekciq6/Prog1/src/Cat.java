
public class Cat {

	public String name;
	
	public int years;
	
	public Cat(){
		
		this.name = "";
		
		this.years = 0;
	}
	
	public Cat(String name, int years){
		
		this();
		
		this.name = name;
		
		this.years = years;
	}
	
	void Say(){
		
		
		System.out.println("Cat name : " +name);
		
		System.out.println("Cat years : " +years);
		
	}
}

