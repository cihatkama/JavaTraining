package tr.com.ckama;

import java.util.*;

public class Q74 { // EchoFirst
	public static void main(String[] args) {
		args = new String[] { "seed", "flower", "plant" };
		Arrays.sort(args);
		int result = Arrays.binarySearch(args, args[0]);
		System.out.println(result);
	}
}