package prog3;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		
		ArrayList<Book>book=new ArrayList<Book>();
		
		book.add(new Book("Book1","Author1",123));
		
		Library temp=new Library("Book2 \t","Author2",book);
		Book temp1=new Book("Book3","Author3",321);
		temp.addBook(temp1);
		
		temp.remBook(temp1);
		temp.print();
	}

}
