package tr.com.ckama;

abstract class Car1 {
	static {
		System.out.print("1");
	}

	public Car1(String name) {
		super();
		System.out.print("2");
	}

	{
		System.out.print("3");
	}
}

public class Q27 extends Car1 {
	{
		System.out.print("4");
	}

	public Q27() {
		super("blue");
		System.out.print("5");
	}

	public static void main(String[] gears) {
		new Q27();
	}
}