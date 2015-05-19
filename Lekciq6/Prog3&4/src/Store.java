import java.util.Scanner;
public class Store extends Stock {
	Scanner input = new Scanner (System.in ,"UTF-8");
  
	public static int counter=0;
	
	String name;
	
	String location;
	
	public Stock[] arr=new Stock[20];
	
	int k=0;
	
	public Store(){
		this.name = "";
		
		this.location = "";
	}
	public Store(String name,String location){
		
		this.name = name;
		
		this.location = location;
	}
	
	void NewProduct(int choice){
		
		if(choice==1){  
		
			String name1;
			
			String type1;
			
			System.out.println("Enter name of product");
			
			name1=input.nextLine();
			
			System.out.println("Enter type of product");
			
			type1=input.nextLine();
			
			arr[counter]=new meat(name1,type1);
			
			counter++;
		}
		if(choice==2){
			
			String name1;
			
			String type1;
			
			System.out.println("Enter name of product");
			
			name1=input.nextLine();
			
			System.out.println("Enter the country of product");
			
			type1=input.nextLine();
			
			
			arr[counter]=new Vegetables(name1,type1);
			
			counter++;
		}
		if(choice==3){
			
			String name1;
			
			String type1;
			
			System.out.println("Enter name of product");
			
			name1=input.nextLine();
			
			System.out.println("Enter the type of product");
			
			type1=input.nextLine();
			
			arr[counter]=new Drinks(name1,type1);
			
			counter++;
		}
		if(choice==4){
			
			String name1;
			
			String type1;
			
			System.out.println("Enter name of product");
			
			name1=input.nextLine();
			
			System.out.println("Enter the type of product");
			
			type1=input.nextLine();
			
			arr[counter]=new Desert(name1,type1);
			
			counter++;
		}
	}
	void Available(int p){
	
		if(p==1){ 
		
			meat counter=new meat();
			
			counter.Available();
		}
		
		if(p==2){
		
			Vegetables counter=new Vegetables();
			
			counter.Available();
		}
		
		if(p==3){ 
			
			Drinks counter=new Drinks();
			
			counter.Available();
		}
		
		if(p==4){ 
		
			Desert counter=new Desert();
			
			counter.Available();
		}
		
	}
	
	void Unavailable(int p){
	
		if(p==1){ 
		
			meat counter=new meat();
			
			counter.SELL();
		}
		
		if(p==2){ 
		
			Vegetables counter=new Vegetables();
			
			counter.SELL();
		}
		
		if(p==3){ 
		
			Drinks counter=new Drinks();
			
			counter.SELL();
		}
		
		if(p==4){ 
		
			Desert counter=new Desert();
			
			counter.SELL();
		}
		
		
	}
	
}