package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q47 {// PrintNegative
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		print(list, e -> Integer.parseInt(e) < 0);
	}

	public static void print(List<String> list, Predicate<String> p) {
		for (String num : list)
			if (p.test(num))
				System.out.println(num);
//		System.out.println(list.toString());
	}
}