public class Listing {
	public static void main(String[] args) {
		
		// uppercase letters
		int startingValue = 65; // A was 65, our starting value
		int endingValue = 90 - 65 + 1; /*Z was 90
		* but Math.random excludes the upper limit, so we added one
		* more to ensure it included z in the possible outputs.*/
		
		//lowercase letters
		int startingValue = 97; // a was 97, our starting value
		int endingValue = 122 - 97 + 1; // z was 122
		
		
		/*Math.random exampole copied from Brennon Cupp's
		 * previous work: work_class.java */
		
		System.out.println((char)(startingValue + Math.random()*(endingValue)));
	}
}
