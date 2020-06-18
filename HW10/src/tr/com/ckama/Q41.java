package tr.com.ckama;

import java.util.*;

public class Q41 { // Museums class
	public static void main(String[] args) {
		String[] array = { "Natural History", "Science", "Art" };
		List<String> museums = Arrays.asList(array);
		museums.remove(1);
		System.out.println(museums);
	}
}