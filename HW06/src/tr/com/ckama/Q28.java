package tr.com.ckama;

public class Q28 {
	private Object contents;

	protected Object getContents() {
		return contents;
	}

	protected void setContents(Object contents) {
		this.contents = contents;
	}

	public void showPresent() {
		System.out.print("Your gift: " + contents);
	}

	public static void main(String[] treats) {
		Q28 gift = new Q28();
		gift.setContents(gift);
		gift.showPresent();
	}
}
