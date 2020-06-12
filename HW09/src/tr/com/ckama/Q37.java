package tr.com.ckama;

import java.time.Period;

public class Q37 {
	public static void main(String[] args) {
		Period period1 = Period.ofWeeks(1).ofDays(3);
		Period period2 = Period.ofDays(10);

		System.out.println(period1.getDays());
		System.out.println(period2.getDays());
	}
}
