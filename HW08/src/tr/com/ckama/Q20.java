package tr.com.ckama;

class GasException extends Exception {
}

class Element {
	public int getSymbol() throws GasException {
		return -1;
	} // g1
}

public class Q20 extends Element { // Oxygen class
	public int getSymbol() {
		return 8;
	} // g2

	public void printData() {
		try {
			System.out.print(getSymbol());
		} catch (Exception e) { // g3
			System.out.print("Unable to read data");
		}
	}
}