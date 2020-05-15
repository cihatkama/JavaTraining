package tr.com.ckama;

public class Q46 {

	public static void main(String[] args) {
		printForLoop0to4();
		printForLoop1to5();
		printDoWhileLoop();
		printWhileLoop();
	}

	private static void printWhileLoop() {
		int k = 0;

		System.out.println("Starting while loop");

		while (k++ < 5) {
			System.out.print(k);
		}

		System.out.println("-----------------------------------------");

	}

	private static void printDoWhileLoop() {
		int k = 0;

		System.out.println("Starting do-while loop");

		do {
			System.out.print(k);
		} while (k++ < 5);

		System.out.println("-----------------------------------------");
	}

	private static void printForLoop0to4() {
		System.out.println("Starting for loop with index 0 to 4");

		for (int k = 0; k < 5; k++) {
			System.out.print(k);
		}

		System.out.println("-----------------------------------------");
	}

	private static void printForLoop1to5() {
		System.out.println("Starting for loop with index 1 to 5");

		for (int k = 1; k <= 5; k++) {
			System.out.print(k);
		}

		System.out.println("-----------------------------------------");
	}
}
