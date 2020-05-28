package tr.com.ckama;

abstract class Book {
	protected static String material = "papyrus";

	public Book() {
	}

	public Book(String material) {
		this.material = material;
	}
}

public class Q21 extends Book { // class Encyclopedia
	public static String material = "cellulose";

	public Q21() {
		super();
	}

	public String getMaterial() {
		return super.material;
	}

	public static void main(String[] pages) {
		System.out.print(new Q21().getMaterial());
	}
}