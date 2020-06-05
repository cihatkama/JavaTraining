package tr.com.ckama;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q49 {
	public void performBackup() {
		try {
			throw new IOException("Disk not found");
		} catch (Exception e) {
			try {
				throw new FileNotFoundException("File not found");
			} catch (FileNotFoundException err) { // z1
				System.out.print("Failed");
			}
		}
	}

	public static void main(String... files) {
		new Q49().performBackup(); // z2
	}
}