package tr.com.ckama;

public class Q15 {

	{
		System.out.println("instance initializer - 1");
	}

	public Q15() {
		System.out.println("constructor");
	}

	static {
		System.out.println("static initializer - 1");
	}

	{
		System.out.println("instance initializer - 2");
	}

	public static void main(String[] args) {
		System.out.println("main() started.");
		Q15 instance1 = new Q15();
		Q15 instance2 = new Q15();

	}

}
