package tr.com.ckama;

public class Q13 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.runFinalization();
	}

}

/**
 * 
 * @author ckama This class created for instance variables, methods and
 *         constructors' order in a class declaration.
 */
class Shape {

	public Shape(int shapeCode, String shapeName) {
		this.shapeCode = shapeCode;
		this.shapeName = shapeName;
	}

	public void setShapeCode(int newShapeCode) {
		this.shapeCode = newShapeCode;
	}

	private int shapeCode;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public String shapeName;
}