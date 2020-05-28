package tr.com.ckama;

abstract class Triangle {
	abstract String getDescription();
}

class RightTriangle extends Triangle {
	protected String getDescription() {
		return "rt";
	} // g1
}

// IsoscelesRightTriangle
public abstract class AQ18 extends RightTriangle { // g2
	protected String getDescription() {
		return "irt";
	}

	public static void main(String[] edges) {
		final Triangle shape = new RightTriangle(); // g3
		System.out.print(shape.getDescription());
	}
}