package tr.com.ckama;

import java.util.function.Predicate;

public class Q28 {

	public static void main(String[] args) {
		Predicate dash = c -> ((String) c).startsWith(" ");
		System.out.println(dash.test("–"));

	}

}
