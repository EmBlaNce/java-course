package lekciq2;

public class Two {

	public static void main(String[] args) {
		int a=3;
		int b=1;
		int c;
		System.out.println("Before change a = " + a);
		System.out.println("Before change b = " + b);
		c=b;
		b=a;
		a=c;
		System.out.println("After change a = " + a);
		System.out.println("Äfter change b = " + b);
    
	}

}
