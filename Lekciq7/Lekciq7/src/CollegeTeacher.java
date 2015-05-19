
public class CollegeTeacher extends Teacher{
    public String information;
	
    public CollegeTeacher(){
		super();
		this.information = "";
	}
	
	public CollegeTeacher(String firstName, String lastName, int years, int workExp, String subject, String information){
		super(firstName, lastName, years, workExp, subject);
		
		setInformation(information);
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	public void sayCollege(){
		System.out.println("This college has " + this.information);
		System.out.println("I can check your homework.");
	}

}