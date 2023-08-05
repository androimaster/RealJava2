package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample35 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,4,7,56,43, 99);
        Integer minNumber = list.stream().min(Integer::compare).get();
        System.out.println("최솟값 :: " + minNumber);
        
        //Sample24.Score 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getMat)))
              .ifPresent(System.out::println);

        scores.stream()
              .min(Comparator.comparing(Score::getMat))
              .ifPresent(System.out::println);
        
        Score maxMathScore = scores.stream()
                                   .max(Comparator.comparing(Score::getMat))
                                   .get();
        System.out.println("최고 수학점수인 사람 :: " + maxMathScore);
    }
}
