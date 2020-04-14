package tr.com.ckama;

public class Q02 {

	public static void main(String[] args) {
		Metal metalInstance = new Metal();
		Gold goldInstance = new Gold();
		Silver silverInstance = new Silver();

		String goldColor = goldInstance.color;

		// Gold class does not inherit luster attribute from Silver class.
		// String goldLuster = goldInstance.luster;

	}

}

class Metal {
	String weight;
	String color;
}

class Gold extends Metal {
	String hue;
}

class Silver extends Metal {
	String luster;
}