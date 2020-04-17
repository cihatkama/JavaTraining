package tr.com.ckama;

public class Q33 { // this class thought as AirPlane class

	static int start = 2;
	final int end;

	public Q33(int x) {
		x = 4;
		end = x;
	}

	public void fly(int distance) {
		System.out.print(end - start + " ");
		System.out.print(distance);
	}

	public static void main(String... start) {
		new Q33(10).fly(5);
	}

}
