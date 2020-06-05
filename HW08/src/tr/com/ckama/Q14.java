package tr.com.ckama;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q14 {
	public void print() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException enfe) {
			System.out.print("X");
		} catch (@SuppressWarnings("hiding") IOException exception) {
			System.out.print("Z");
		} finally {
			System.out.print("Y");
		}
	}

	public static void main(String... ink) {
		new Q14().print();
	}
}