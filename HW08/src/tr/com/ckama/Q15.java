package tr.com.ckama;

public class Q15 {
	public static void main(String[] args) {

		try {
			System.out.println("try block works.");
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("catch block works.");
		} finally {
			System.out.println("finally block works.");
		}
	}
}
