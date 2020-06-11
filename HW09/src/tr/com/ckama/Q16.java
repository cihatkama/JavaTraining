package tr.com.ckama;

import java.util.function.Predicate;

public class Q16 {
	Predicate<String> pred1 = s -> false;
	Predicate<String> pred2 = (s) -> false;
//	Predicate<String> pred3 =
//	String s->false;
	Predicate<String> pred4 = (String s) -> false;
}
