package tr.com.ckama;

public class Q09 {
	public static void main(String officials[]) {
		try {
			System.out.print('A');
			throw new RuntimeException("Out of bounds!");
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.print('C');
		}
	}
}