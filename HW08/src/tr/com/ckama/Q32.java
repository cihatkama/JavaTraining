package tr.com.ckama;

class BigCat {
	void roar(int level) throws RuntimeException { // m1
		if (level < 3)
			throw new IllegalArgumentException("Incomplete");
		System.out.print("Roar!");
	}
}

public class Q32 extends BigCat {
	public void roar() { // m2
		System.out.print("Roar!!!");
	}

	public static void main(String[] cubs) {
		final BigCat kitty = new Q32(); // m3
		kitty.roar(2);
	}
}