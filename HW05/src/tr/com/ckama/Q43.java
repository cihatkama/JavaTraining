package tr.com.ckama;

import java.util.Arrays;
import java.util.List;

public class Q43 {
	public static void main(String[] args) {
		List<String> exams = Arrays.asList("OCA", "OCP");
		for (String e1 : exams)
			for (String e2 : exams)
				System.out.println(e1 + " " + e2);
	}
}
