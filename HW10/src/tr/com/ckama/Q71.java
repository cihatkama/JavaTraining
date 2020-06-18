package tr.com.ckama;

class OpenDoorException extends Exception {
}

class CableSnapException extends OpenDoorException {
}

public class Q71 { // Palace class
	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Problem");
		} catch (OpenDoorException e) {
			throw new OpenDoorException();
		} catch (Exception ex) {
			try {
				throw new OpenDoorException();
			} catch (CableSnapException ex1) {
			} finally {
				System.out.println("Almost done");
			}
		} finally {
			throw new RuntimeException("Unending problem");
		}
	}

	public static void main(String[] moat) throws Exception {
		new Q71().openDrawbridge();
	}
}