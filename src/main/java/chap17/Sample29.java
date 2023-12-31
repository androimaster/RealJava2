package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample29 {
    public static void main(String[] args) {
        //Sample23.Student 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        // 수학 점수를 기준으로 A, B, C, D, F 학점으로 분류합니다.
        Map<String, List<Score>> result = scores.stream()
                                                .collect(Collectors.groupingBy( s -> {
                                                     return (s.getMat() > 90) ? "A" : 
                                                            (s.getMat() > 80) ? "B" : 
                                                            (s.getMat() > 70) ? "C" :  
                                                            (s.getMat() > 60) ? "D" : "F"; 
                                                }));
        
        result.keySet().forEach(key -> {
            System.out.printf("** 수학 %s 학점\n", key);
            List<Score> score = result.get(key);
            score.stream().forEach(s -> System.out.println(s.getName()));
        });        
    }
}
