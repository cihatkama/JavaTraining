package tr.com.ckama;

public class Q07 {

	public static void main(String[] args) {
		new Cucumber();

	}

}

class Vegetable {

	public Vegetable() {
		System.out.println("Vegetable's constructor");
	}

}

class Cucumber extends Vegetable {
	public Cucumber() {
		this(4);
//		super();
		System.out.println("Cucumber's constructor");
	}

	Cucumber(int val) {
		System.out.println("count : " + val);
	}
}
