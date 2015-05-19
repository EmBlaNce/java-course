
public class Vegetables extends Stock {


	String name;
	
	String countryFrom;

	static int count=0;
	
	public Vegetables(){
	
		this.name = "";
		this.countryFrom = "";
	}
	public Vegetables(String name,String countryFrom){
		
		this.name = name;
		this.countryFrom = countryFrom;
		
		count++;
		
	}
	
	void Available(){
	
		System.out.println(count);
	}
	void SELL(){
		count=0;
	}
}