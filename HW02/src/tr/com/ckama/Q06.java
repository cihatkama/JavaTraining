package tr.com.ckama;

public class Q06 {

	/**
	 * Invalid method. int type has not implemented toString() method.
	 * 
	 * public String convertInt(int value) { return value.toString(); }
	 */

	public String convertInt(int value) {
		return value + "";
	}

	public String convertInteger(Integer value) {
		return value.toString();
	}

	public String convertObject(Object value) {
		return value.toString();
	}

	public static void main(String[] args) {

		Q06 instance = new Q06();
		System.out.println("test for convertInt() - " + instance.convertInt(14));

	}

}
