
public class Lecturer extends Person {
	public String university;

	
	public Lecturer(){
		this.university = "";
	}
	
	public Lecturer(String firstName, String lastName, int years, int workExp, String university){
		super(firstName, lastName, years, workExp);
		
		setUniversity(university);

	}

	public String getUniversityt() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
	public void sayWhere(){
		System.out.println("I am lecturer in " + this.university);
	}
	
		public void Lchecking(){
		System.out.println("I will check students' homework.");
	}
	
	public void teaching(){
		System.out.println("Today i am going to tell you about Albert Einstein.");
	}
	
	public void teaching(int a){
		a = 3;
		System.out.println("I will give you test " + a + " times per month.");
	}
	
	public void teaching(String str){
		str = "George";
		System.out.println( str + " is going to tell us about Albert Einstein.");
	}
	
	public void sayHi(){
		System.out.println("Hello students, how are you?");
	}
	

}