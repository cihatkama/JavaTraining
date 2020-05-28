package tr.com.ckama;

interface Run {
	default void walk() {
		System.out.print("Walking and running!");
	}
}

interface Jog {
	default void walk() {
		System.out.print("Walking and jogging!");
	}
}

public class Q14 implements Run, Jog { // think as Sprint class
	public void walk() {
		System.out.print("Sprinting!");
	}

	public static void main(String[] args) {
		new Q14().walk();
	}
}