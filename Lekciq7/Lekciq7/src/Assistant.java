
public class Assistant extends Lecturer{
	boolean chief;
	
	public Assistant(){
		super();
		this.chief = false;
	}
	
	public Assistant(String firstName, String lastName, int years, int workExp, String university, boolean chief){
		super(firstName, lastName, years, workExp, university);
		
		setChief(chief);
	}

	public boolean getChief() {
		return chief;
	}

	public void setChief(boolean chief) {
		this.chief = chief;
	}
	
	public void sayChief(){
		System.out.println("My name is " + super.getFirstName() + super.getLastName());
		System.out.println("I am chief assistant- " + this.chief);
		System.out.println("Now let me see your homework.");
	}
	
	public void sayScience(){
		System.out.println("I can write scientific articles.");
	}
	
	public void sayCheckExam(){
		System.out.println("I can check exams.");
	}

}