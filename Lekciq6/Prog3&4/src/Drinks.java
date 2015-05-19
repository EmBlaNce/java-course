
public class Drinks extends Stock {
	
	String name;
	
	String type;
	
	static int count=0;
	
	public Drinks(){
	
		this.name = "";
		
		this.type = "";
	}
	
	public Drinks(String name,String type){
		
		this.name = name;
		
		this.type = type;
		count++;
	}
	
	void Available(){
		System.out.println(count);
	}
	void SELL(){
		count=0;
	}
}