package tr.com.ckama;

public class Q56 { // Cowboy class
	private int space = 5;
	private double ship = space < 2 ? 1 : 10; // g1

	public void printMessage() {
		if (ship > 1) {
			System.out.println("Goodbye");
		}
		if (ship < 10 && space >= 2)
			System.out.println("Hello"); // g2
		else
			System.out.println("See you again");
	}

	public static final void main(String... stars) {
		new Q56().printMessage();
	}
}