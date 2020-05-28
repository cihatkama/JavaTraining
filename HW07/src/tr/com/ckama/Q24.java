package tr.com.ckama;

interface Sphere {
	default String getName() {
		return "Unknown";
	}
}

abstract class Planet {
	abstract String getName();
}

public class Q24 extends Planet implements Sphere { // class Mars
	public Q24() {
		super();
	}

	public String getName() {
		return "Mars";
	}

	public static void main(final String[] probe) {
		System.out.print(((Planet) new Q24()).getName());
	}
}