package tr.com.ckama;

public class Q41 {// Countdown class
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("54321");
		String builderStr = builder.substring(2);
		System.out.println(builderStr);
		System.out.println(builder.charAt(1));
	}
}