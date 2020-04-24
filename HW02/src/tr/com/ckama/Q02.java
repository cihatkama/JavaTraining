package tr.com.ckama;

public class Q02 {

	public static void main(String[] args) {
		String chair = "", table = "metal";
		
		// not initialized string may not insert into another string.
		chair = chair + table;
		System.out.println(chair);
	}
	
	
}
