package tr.com.ckama;

public class Q33 { // Legos class
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
//		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
	}
}