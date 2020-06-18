package tr.com.ckama;

public class Q48 { // Highway class
	public int drive(long car) {
		return 2;
	}

	public int drive(double car) {
		return 3;
	}

	public int drive(int car) {
		return 5;
	}

	public int drive(short car) {
		return 3;
	}

	public static void main(String[] gears) {
		float value = 5;
		System.out.print(new Q48().drive(value));
	}
}