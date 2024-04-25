package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample55 {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("소나타", "그랜져", null, "아반테", null, "캐스퍼");
//		list.stream().flatMap(Stream::ofNullable).forEach(System.out::println);
		String[] arrStr = {"소나타", "그랜져", null, "아반테", null, "캐스퍼"};
		Stream<String[]> stream = Stream.ofNullable(arrStr); //Stream.of(arrStr);

		stream.forEach(System.out::println);
	}

}
