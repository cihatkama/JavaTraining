package tr.com.ckama;

import java.time.*;
import java.time.format.*;

public class Q59 { // HowLong class
	public static void main(String... h) {
		LocalDate newYears = LocalDate.of(2017, 06, 15);
		Period period = Period.ofYears(1).ofDays(1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}
}