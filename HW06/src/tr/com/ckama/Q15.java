package tr.com.ckama;

public class Q15 { // Think as Ski class
	private int age = 18;

	private static void slalom(Q15 racer, int[] speed, String name) {
		racer.age = 18;
		name = "Wendy";
		speed = new int[1];
		speed[0] = 11;
		racer = null;
	}

	public static void main(String... mountain) {
		final Q15 mySkier = new Q15();
		mySkier.age = 16;
		final int[] mySpeed = new int[1];
		final String myName = "Rosie";
		slalom(mySkier, mySpeed, myName);

		System.out.println(mySkier.age);
		System.out.println(myName);
		System.out.println(mySpeed[0]);
		System.out.println("------------------------------");

	}
}
