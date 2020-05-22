package tr.com.ckama;

public class Q03 { // think as Bond class
	private static int price = 5;

	public boolean sell() {
		if (price < 10) {
			price++;
			return true;
		} else if (price >= 10) {
			return false;
		} else
			return true;
	}

	public static void main(String[] cash) {
		new Q03().sell();
		new Q03().sell();
		new Q03().sell();
		System.out.print(price);
	}
}
