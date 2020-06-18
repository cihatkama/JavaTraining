package tr.com.ckama;

import java.util.*;

public class Q63 { // EchoFirst class
	public static void main(String[] args) {
		args = new String[] { "seed", "flower", "plant" };
		int result = Arrays.binarySearch(args, args[0]);
		System.out.println(result);
	}
}