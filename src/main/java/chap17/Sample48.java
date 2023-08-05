package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample48 {
    public static void main(String[] args) {
        //Sample23.Score 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        System.out.println("이름 순으로 순정렬");
        List<Score> list1 = scores.stream()
                                  .sorted((x, y) -> x.getName().compareTo(y.getName()))
                                  .collect(Collectors.toList());
        System.out.println(list1.toString());
        
        System.out.println("영어 성적순으로 역정렬");
        List<Score> list2 = scores.stream()
                                  .sorted((x, y) -> y.getEng() - x.getEng())
                                  .collect(Collectors.toList());
        System.out.println(list2.toString());
    }
}
