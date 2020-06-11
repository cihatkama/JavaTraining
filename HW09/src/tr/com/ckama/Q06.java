package tr.com.ckama;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

	public static void main(String[] args) {
		List<String> tools = new ArrayList<>();
		tools.add("hammer");
		tools.add("nail");
		tools.add("hex key");

		for (String list : tools)
			System.out.println(list);
	}

}
