package tr.com.ckama;

abstract class Parallelogram {
	private int getEqualSides() {
		return 0;
	}
}

abstract class Rectangle extends Parallelogram {
	public int getEqualSides() {
		return 2;
	} // x1
}

public final class Q31 extends Rectangle { // Square class
	public int getEqualSides() {
		return 4;
	} // x2

	public static void main(String[] corners) {
		final Q31 myFigure = new Q31(); // x3
		System.out.print(myFigure.getEqualSides());
	}
}