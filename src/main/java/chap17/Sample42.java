package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample42 {
    public static void main(String[] args) {
        // 2개의 String 배열이 있습니다.
        String[] str1 = {"낙화", "최정환", "뿜뿜"};
        String[] str2 = {"out standing", "빵형"};
        
        // 2개의 String 배열을 스트림으로 만듭니다. 
        //[{"낙화", "최정환", "뿜뿜"}, {"out standing", "빵형"}]
        Stream<String[]> strm = Stream.of(str1, str2);
        
        List<String> list = 
            //{"낙화", "최정환", "뿜뿜", "out standing", "빵형"} 한개의 배열로 스트림 변환
            strm.flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());  //List<String>으로 변환
        System.out.println(list.toString());
    }
}
