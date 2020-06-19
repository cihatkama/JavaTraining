package tr.com.ckama;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q76 {
	public static void main(String... nums) {
		LocalDateTime time = LocalDateTime.of(20, 4, 18, 0, 0);
		while (time.getHour() < 1) {
			time.plusHours(1);
			System.out.println("in loop");
		}
	}
}