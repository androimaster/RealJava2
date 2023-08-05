package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample26 {
    public static void main(String[] args) {
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );

        System.out.println("** 국어가 최저 점수인 학생");
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getKor)))
              .ifPresent(System.out::println);

        System.out.println("** 영어가  최고 점수인 학생");
        scores.stream()
              .collect(Collectors.maxBy(Comparator.comparing(Score::getKor)))
              .ifPresent(System.out::println);
        
        System.out.println("**이름순으로 제일 빠른 학생");
        scores.stream()
              .collect(Collectors.minBy(Comparator.comparing(Score::getName)))
              .ifPresent(System.out::println);
        
        System.out.println("**이름순으로 제일 느린 학생");
        scores.stream()
              .collect(Collectors.maxBy(Comparator.comparing(Score::getName)))
              .ifPresent(System.out::println);
    }
}
