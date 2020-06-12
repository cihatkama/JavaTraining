package tr.com.ckama;

public class Q39 {
	public static void main(String[] args) {
		/*
		 * A. happy.substring(0, happy.length() - 1) B. happy.substring(0,
		 * happy.length()) C. happy.substring(1, happy.length() - 1) D.
		 * happy.substring(1, happy.length())
		 */

		String happy = " :) - (: ";
		System.out.println(happy);
		String really = happy.trim();
		System.out.println(really);
		String question = happy.substring(1, happy.length() - 1);
		System.out.println(question);

		System.out.println(really.equals(question));
	}
}
