package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6_2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("소나타", "그랜져", null, "아반테", null, "캐스퍼");
		list.stream().flatMap(Stream::ofNullable).forEach(System.out::println);
	}

}
