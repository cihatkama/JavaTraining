package tr.com.ckama;

public class Q09 { // Equivalency class
	public static void main(String[] edges) {
		final String ceiling = "up";
		String floor = new String("up");
		final String wall = new String(floor);
		System.out.println(wall.equals(floor));
		System.out.print((ceiling == wall) + " " + (floor == wall) + " " + ceiling.equals(wall));
	}
}