package tr.com.ckama;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q38 { // HowLong
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		System.out.println(format.format(newYears));

		Period period = Period.ofDays(1);
		System.out.print(format.format(newYears.minus(period)));
	}
}