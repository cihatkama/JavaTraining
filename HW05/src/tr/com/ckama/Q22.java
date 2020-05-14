package tr.com.ckama;

public class Q22 {
	public static void main(String[] args) {

		String[] fun = new String[] { "dance", "music", "trekking" };

		for (int i = 0; i < fun.length; i++)
			System.out.println(fun[i]);

		for (String f : fun)
			System.out.println(f);

	}
}
