package tr.com.ckama;

class PrintException extends Exception {
}

class PaperPrintException extends PrintException {
}

public interface IQ18 {
	abstract int printData() throws PrintException;
}

class PrinterTest implements IQ18 {

	@Override
	public int printData() throws PrintException {
		// TODO Auto-generated method stub
		return 0;
	}
	// valid method
//	public int printData() throws PaperPrintException {
//		return 0;
//	}

	// valid method.
//	public int printDataOptA() throws Exception {
//		return 0;
//	}

//	public int printData() {
//		return 0;
//	}

}