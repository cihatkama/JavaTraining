package tr.com.ckama;

public class Q50 { // Dance class
	public static void swing(int... beats) throws ClassCastException {

		try {
			System.out.print("1" + beats[2]); // p1
		} catch (RuntimeException e) {
			System.out.print("2");
		} catch (Exception e) {
			System.out.print("3");
		} finally {
			System.out.print("4");
		}
	}

	public static void main(String... music) {
		new Q50().swing(0, 0); // p2
		System.out.print("5");
	}
}
