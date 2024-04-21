package chap17;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("소나타", "그랜져", null, "아반테", null, "캐스퍼");
		list.stream().filter(x -> x != null).forEach(System.out::println);
	}

}
