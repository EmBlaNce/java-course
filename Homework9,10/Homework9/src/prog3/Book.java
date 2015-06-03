package prog3;

public class Book {
	 protected String name;
	 protected String author;
	 protected int page;
	 
	 public Book(){
		 this.name="";
		 this.author="";
		 this.page=0;
	 }
	 public Book(String name,String author,int page){
		 this.name=name;
		 this.author=author;
		 this.page=page;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String autor) {
		this.author = autor;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
	 