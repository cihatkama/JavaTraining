package tr.com.ckama;

public class Q09 {
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("12");
		b = b.append("3");
//		b.delete(0, 1);
		b.reverse();
		System.out.println(b.toString());
	}
}
