package prog3;

import java.util.ArrayList;


public class Library {

	private String name;
	private String address;
	private ArrayList<Book>books=new ArrayList<Book>();
	
	public Library() {
		super();
		
	}

	public Library(String name, String adres, ArrayList<Book> books) {
		super();
		this.name = name;
		this.address = adres;
		this.books = books;
	}
	 
	public void addBook(Book temp){
		books.add(temp);
	}
	public void remBook(Book temp){
		books.remove(temp);
	}
	public void print(){
		System.out.print(name);
		System.out.print(address);
		System.out.println();
		
       for(int i = 0; i < books.size(); i++){
    	   System.out.println(books.get(i).getAuthor());
    	   System.out.println(books.get(i).getName());
    	   System.out.println(books.get(i).getPage());
       }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAdres(String adres) {
		this.address = adres;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
}