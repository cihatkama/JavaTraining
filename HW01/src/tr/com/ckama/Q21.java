package tr.com.ckama;

public class Q21 { // as public class Tolls

	private static int yesterday = 1;
	int tomorrow = 10;

	public static void main(String[] args) {
		Q21 tolls = new Q21();
		int today = 20, tomorrow = 40;

		System.out.println("local tomorrow variable is " + tomorrow);
		System.out.println("today + tolls.tomorrow + tolls.yesterday = " + (today + tolls.tomorrow + tolls.yesterday));
	}

}
