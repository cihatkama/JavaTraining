package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');
		chars.remove(0);
		System.out.println(chars);
		System.out.print(chars.size() + " " + chars.contains('b'));
	}
}
