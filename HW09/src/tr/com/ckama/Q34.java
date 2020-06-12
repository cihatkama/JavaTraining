package tr.com.ckama;

import java.util.function.Predicate;

public class Q34 {

	public static void main(String[] args) {

		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink"));
		System.out.println(clear.test("clear"));

	}

}
