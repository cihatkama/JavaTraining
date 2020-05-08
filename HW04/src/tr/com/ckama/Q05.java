package tr.com.ckama;

public class Q05 {

	public void printStormName(String... names) {

	}

	public void printStormNames(String[] names) {

	}

	public static void main(String[] args) {

		Q05 instance = new Q05();

		instance.printStormName("Arlene");

		instance.printStormName(new String[] { "Bret" });

//		instance.printStormNames("Cindy");

		instance.printStormNames(new String[] { "Katrina" });

	}

}
