package tr.com.ckama;

import java.util.Arrays;

public class Q32 { // class EchoFirst

	public static void main(String[] args) {
		String one = args[0];
		Arrays.sort(args);
		int result = Arrays.binarySearch(args, "flower");
		System.out.println(result);
	}
}
