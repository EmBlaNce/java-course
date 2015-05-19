
public class SchoolTeacher extends Teacher{
	public String schoolclass;
	
	public SchoolTeacher(){
		super();
		this.schoolclass = "";
	}
	
	public SchoolTeacher(String firstName, String lastName, int years, int workExp, String subject, String schoolclass){
		super(firstName, lastName, years, workExp, subject);
		
		setSchoolClass(schoolclass);
	}

	public String getSchoolClass() {
		return schoolclass;
	}

	public void setSchoolClass(String schoolclass) {
		this.schoolclass = schoolclass;
	}
	
	public void sayClass(){
		System.out.println("This class is " + this.schoolclass);
		System.out.println("I can check your homework.");
		
	}
	
	public void sayJoke(){
		System.out.println("There was a horse and it fell out from the window. Ha-ha-ha.");
	}

}