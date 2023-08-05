package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample38 {
    public static void main(String[] args) {
        //Sample24.Score 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        boolean result1 = scores.stream()
                                .anyMatch(x -> x.getMat() > 39);
        System.out.println("수학 과락이 아닌 사람이 있나요? " + result1);

        boolean result2 = scores.stream()
                                .allMatch(x -> x.getKor() > 39);
        System.out.println("국어 과락은 없나요? " + result2);

        boolean result3 = scores.stream()
                                .noneMatch(x -> x.getEng() > 39);
        System.out.println("영어는 모두 과락인가요? " + result3);
    }
}
