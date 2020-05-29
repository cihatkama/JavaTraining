package tr.com.ckama;

import java.io.EOFException;
import java.io.IOException;

class Machine50 {
	public boolean turnOn() throws EOFException, IOException {
		return true;
	}
}

public class Q50 extends Machine50 { // class Robot
	public boolean turnOn() throws IOException {
		return false;
	}

	public static void main(String[] doesNotCompute) throws Exception {
		Machine50 m = new Q50();
		System.out.print(m.turnOn());
	}
}