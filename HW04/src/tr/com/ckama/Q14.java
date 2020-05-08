package tr.com.ckama;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 5, 1, 4 };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.binarySearch(nums, 5));

	}

}
