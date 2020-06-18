package tr.com.ckama;

import java.time.LocalTime;

public class Q13 { // OnePlusOne class
	public static void main(String... nums) {
		LocalTime time = LocalTime.of(1, 11);
		while (time.getHour() < 1) {
			time.plusHours(1);
			System.out.println("in loop");
		}
//		System.out.println("Finished");
	}
}
