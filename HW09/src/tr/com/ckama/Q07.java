package tr.com.ckama;

public class Q07 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical");
		System.out.println("initialization length : " + sb.length());
		sb.insert(sb.length(), "robots");
		System.out.println(sb);
	}

}
