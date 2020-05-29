package tr.com.ckama;

import java.io.FileNotFoundException;

public class Q41 {
	protected void dance() throws FileNotFoundException {
	}

	public static void main(String[] args) {
		Q41 instance = new SubClassOfQ41();
		try {
			instance.dance();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class SubClassOfQ41 extends Q41 {

	protected void dance() throws FileNotFoundException {
		System.out.println("overridden method");
	}
}
