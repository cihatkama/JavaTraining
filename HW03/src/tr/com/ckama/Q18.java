package tr.com.ckama;

public class Q18 {

	public static void main(String[] args) {

		int dayOfWeek = 3;

		final byte saturday = 6;

		switch (dayOfWeek) {
		case saturday:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Another weekday");
			break;
		}

	}

}
