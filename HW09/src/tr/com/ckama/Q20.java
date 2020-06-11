package tr.com.ckama;

public class Q20 {

	static void testA() {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").append("robots");
		System.out.println(sb);
	}

	static void testB() {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").delete(1, 100).append("obots").insert(1, "adical r");
		System.out.println(sb);
	}

	static void testC() {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").insert(7, "robots");
		System.out.println(sb);
	}

	static void testD() {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").insert(sb.length(), "robots");
		System.out.println(sb);
	}

	public static void main(String[] args) {
		System.out.println("Testing for option A");
		testA();

		System.out.println("Testing for option B");
		testB();

		System.out.println("Testing for option C");
		testC();

		System.out.println("Testing for option D");
		testD();
	}

}
