
public class Teacher extends Person {
	public String subject;
	
	public Teacher(){
		super();
		this.subject = "";
	}
	
	public Teacher(String firstName, String lastName, int years, int workExp, String subject){
		super(firstName, lastName, years, workExp);
		
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void sayTeaching(){
		System.out.println("Let me teach you  " + this.subject);
	}
	
	public void checking(){
		System.out.println("Let me check your homework.");
	}
	
	public void hello(){
		System.out.println("Hello students.");
	}
	
	public void goodbye(){
		System.out.println("Goodbye students.");
	}

}