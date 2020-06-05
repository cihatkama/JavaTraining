package tr.com.ckama;

public class Q41 { // WhachAnException
	public static void main(String... hammer) {
		try {
			throw new ClassCastException();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			throw new NullPointerException();
		} finally {
			throw new RuntimeException();
		}
	}
}