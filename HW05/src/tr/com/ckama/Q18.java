package tr.com.ckama;

public class Q18 {

	public static void main(String[] args) {

		System.out.println("Entering to the loop.");

		for (;;) {
			System.out.println("Loop started.");
			if (true) {
				System.out.println("if block started.");
				break;
			}
		}
		System.out.println("Loop ended.");
	}
}
