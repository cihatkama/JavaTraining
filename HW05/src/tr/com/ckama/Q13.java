package tr.com.ckama;

import java.util.Arrays;
import java.util.List;

public class Q13 {
	public static void main(String[] args) {
		List<String> bottles = Arrays.asList("glass", "plastic");
		for (int type = 0; type < bottles.size();) {
			System.out.print(bottles.get(type) + ",");
			break;
		}
		System.out.print("end");
	}
}
