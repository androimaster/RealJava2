package chap17;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Map;

public class Sample20 {
    public static void main(String[] args) {
        String[][] level = {
            {"낙화", "초급"}, {"낙화", "중급"}
            , {"최정환", "중급"}, {"뿜뿜", "고급"}, {"out standing", "특급"}
        };
        
        Map map = Arrays.stream(level)
                        .collect(toMap(x -> x[0], x -> x[1], (x, y) -> x + ", " + y));
        System.out.println(map.toString());
    }
}
