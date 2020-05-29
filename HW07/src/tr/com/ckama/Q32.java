package tr.com.ckama;

class Rotorcraft {
	protected final int height = 5;

	int fly() {
		return 0;
	}
}

public class Q32 extends Rotorcraft {
	private int height = 10;

	protected int fly() {
		return super.height;
	}

	public static void main(String[] unused) {
		Q32 helo = (Q32) new Rotorcraft();
		System.out.print(helo.fly());
	}
}