package program8;

public class RecursiveFactoriel {
	
	public static void main(String[] args) {
		
		System.out.println(factoriel(5, 1));
	}

	public static final long factoriel(int range, long factoriel) {
		if (range > 0) {
			
			factoriel *= range;
			range--;
			return factoriel(range, factoriel);
		}
		return factoriel;
	}
}
