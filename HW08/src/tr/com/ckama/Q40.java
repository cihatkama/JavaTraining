package tr.com.ckama;

public class Q40 {
	public Long zipper() throws Exception {
		try {
			String checkZipper = (String) new Object();
		} catch (Exception e) {
			throw new RuntimeException("Broken!");
		}
		return null;
	}

	public static void main(String... warmth) {
		try {
			new Q40().zipper();
			System.out.print("Finished!");
		} catch (Throwable t) {
		}
	}
}