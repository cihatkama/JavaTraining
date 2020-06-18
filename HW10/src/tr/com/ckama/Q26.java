package tr.com.ckama;

interface Plant {
	default String grow() {
		return "Grow!";
	}
}

interface Living {
	public default String grow() {
		return "Growing!";
	}
}

public class Q26 implements Plant, Living { // m1
	public String grow(int height) {
		return "Super Growing!";
	}

	@Override
	public String grow() {
		// TODO Auto-generated method stub
		return Plant.super.grow();
	}

	/*
	 * @Override public String grow() { return Living.super.grow(); }
	 */

	public static void main(String[] leaves) {
		Plant p = new Q26(); // m2
		System.out.print(((Living) p).grow()); // m3
	}
}