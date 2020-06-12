package tr.com.ckama;

import java.time.LocalDate;

public class Q50 {
	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		xmas.ofYearDay(2017, 13);
//		xmas.setYear(2016);
		System.out.println(xmas.getYear() + "/" + xmas.getMonthValue() + "/" + xmas.getDayOfMonth());
	}
}
