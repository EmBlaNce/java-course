
public class Professor extends Lecturer {
	public String title;
	

	public Professor(){
		super();
		this.title = "";
	}
	
	public Professor(String firstName, String lastName, int years, int workExp, String university, String title){
		super(firstName, lastName, years, workExp, university);
		
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void sayExperience(){
		System.out.println("My title is " + this.title);
		System.out.println("My work experience is " + super.getWorkExp());
		System.out.println("Now let me see your homework.");
	}
	
	public void sayMakeExam(){
		System.out.println("I can make exams.");
	}

}