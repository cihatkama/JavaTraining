package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;

public class Q22 {

	public static void main(String[] args) {
		List<String> museums = new ArrayList();
		museums.add("abc");

		System.out.println(museums.contains("abc"));
		System.out.println(museums.equals("abc"));

		museums.clear();
	}

}
