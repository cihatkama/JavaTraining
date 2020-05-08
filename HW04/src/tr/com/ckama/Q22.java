package tr.com.ckama;

public class Q22 {
	public static void addStationName(String[] names) {
		names[names.length] = "Times Square";
	}

	public static void main(String[] args) {
		String[] names = new String[] { "London Eye", "Eiffel" };
		addStationName(names);
	}
}
