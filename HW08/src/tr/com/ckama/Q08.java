package tr.com.ckama;

import java.io.IOException;

public class Q08 {
	public static void main(String[] args) throws IOException, Exception {

		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("An Exception occured.");
		} catch (Exception err) {
			// TODO: handle exception
			System.err.println("An IOException occured.");
		}

	}
}
