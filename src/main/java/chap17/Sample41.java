package chap17;

import java.util.Arrays;
import java.util.List;

public class Sample41 {
    public static void main(String[] args) {
        //Sample24.Score 객체를 활용합니다.
        List<Score> scores = Arrays.asList(
            new Score("낙화", 61, 71, 41),
            new Score("최정환", 62, 52, 82),
            new Score("뿜뿜", 37, 100, 61),
            new Score("out standing", 55, 100, 72)
        );
        
        scores.stream()
              .map(
                   x -> {
                       if(x.getKor() < 40 || x.getEng() < 40 || x.getMat() < 40) {
                           x.setMsg("과락입니다.");
                       }
                       else if((x.getKor() + x.getEng() + x.getMat()) / 3 < 60) {
                           x.setMsg("불합격입니다.");
                       }
                       else {
                           x.setMsg("합격입니다.");
                       }
                       return x;
                   }
               )
              .forEach(System.out::println);
    }
}
