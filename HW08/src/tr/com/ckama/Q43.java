package tr.com.ckama;

public class Q43 {	// Street class
	public static void dancing() throws RuntimeException {
		try {
			throw new IllegalArgumentException();
		} catch (Error err) {
			System.out.print("Unable!");
		}
	}

	public static void main(String... count) throws RuntimeException {
		dancing();
	}
}