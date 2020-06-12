package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;

public class Q42 {
	public static void main(String[] args) {
		List<Integer> pennies = new ArrayList<>();
		pennies.add(3);
		pennies.add(2);
		pennies.add(1);
		pennies.remove(2);
		// java.lang.IndexOutOfBoundsException
		// pennies.add(3, 42);
		System.out.println(pennies);
	}
}
