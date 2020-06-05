package tr.com.ckama;

public class Q01 {
	public static void think() throws Exception { // k1
		try {
			throw new Exception();
		} finally {
			System.err.println("Error occured.");
		}
	}

	public static void main(String... ideas) throws Exception {
		think();
	}
}