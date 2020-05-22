package tr.com.ckama;

public class Q33 {

	static String author = "ckama";
	static int id;

	static {
		System.out.println(id);
	}

	public static void setId(int idParam) {
		id = 5;
		System.out.println(id);
	}

	public Q33() {
		final int counter = 0;
	}

	public int getNumberOfPages(String author) {

		return 42;

	}

}
