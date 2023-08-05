package chap17;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Map;

public class Sample19 {
    public static void main(String[] args) {
        String[][] level = {
            {"낙화", "초급"}, {"최정환", "중급"}, {"뿜뿜", "고급"}, {"out standing", "특급"}, {"낙화", "초급"}
        };
        Map map = Arrays.stream(level)
                        .collect(toMap(x -> x[0], x -> x[1]));
        System.out.println(map.toString());
    }
}
