package tr.com.ckama;

import java.util.Arrays;
import java.util.List;

public class Q20 {
	public static void main(String[] args) {
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = 0; container < drinks.size(); container++)
			System.out.print(drinks.get(container) + ",");
	}
}