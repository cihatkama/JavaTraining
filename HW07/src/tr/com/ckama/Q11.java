package tr.com.ckama;

class Computer {
	protected int process() {
		return 5;
	}
}

public class Q11 extends Computer {
	public final int process() {
		return 3;
	}

	public static void main(String[] chips) {
		System.out.print(new Q11().process());
	}
}