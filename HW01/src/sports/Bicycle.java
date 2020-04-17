package sports;

public class Bicycle {
	String color = "red";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// This method was made public to access it from a class in different package.
	public void printColor(String color) {
		color = "purple";
		System.out.print(color + "\n");
	}

	public static void main(String[] args) {
		new Bicycle().printColor("blue");

	}
}
