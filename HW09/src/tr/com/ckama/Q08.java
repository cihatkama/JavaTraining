package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;

public class Q08 {
	public static void main(String[] args) {
		List<String> museums = new ArrayList<>(1);
		museums.add("Natural History");
		museums.remove(0);
		museums.add("Science");
		museums.add("Art");
		// museums.remove(2);
		System.out.println(museums);
	}
}
