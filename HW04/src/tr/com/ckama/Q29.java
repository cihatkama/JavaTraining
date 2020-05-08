package tr.com.ckama;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows", "Mac", "Linux", "Windows" };
		Arrays.sort(os);
//		System.out.println(Arrays.deepToString(os));
		System.out.println(Arrays.binarySearch(os, "Other OS"));
	}
}
