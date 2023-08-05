package chap17;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample03 {
    public static void main(String[] args) {
        DataObj[] data = {new DataObj(1, "낙화"), new DataObj(2, "최정환")
                , new DataObj(3, "뿜뿜"), new DataObj(4, "out standing")};
        Stream<DataObj> stm = Arrays.stream(data);
        stm.forEach(System.out::println);
        
        System.out.println();
        
        //스트림 생성 후 바로 출력도 할 수 있습니다.
        Arrays.stream(data).forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class DataObj {
    int no;
    String name;
}
