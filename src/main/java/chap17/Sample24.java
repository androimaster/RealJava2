package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Sample24 {
    public static void main(String[] args) {
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        double averageMat = scores.stream()
                                  .collect(Collectors.averagingInt(Score::getMat));
        System.out.printf("빵고등학교 수학 평균은 [%f]입니다.", averageMat);
    }
}

@Data
@RequiredArgsConstructor
class Score {
    private final String name;
    private final int    kor;
    private final int    eng;
    private final int    mat;
    private       String msg;
}
