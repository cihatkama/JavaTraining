package tr.com.ckama;

import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) {
		int[] myArray = new int[] { 42, 16, 33, 32, 34, 81, 7 };

		System.out.println("Not sorted array review.");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();

//		int result = Arrays.binarySearch(myArray, 42);
//		System.out.println("Looked for " + result);

		// sorting array
		Arrays.sort(myArray);

		System.out.println("Sorted array review.");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}

}
