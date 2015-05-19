
public class meat extends Stock {
	
	String name;
	
	static int  count=0;
	
	String type;
	
	public meat(){
	
		this.name = "";
		
		this.type = "";
	}
	
	public meat(String name,String type){
		
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