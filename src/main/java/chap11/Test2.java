package chap11;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 3, 8, 2, 9, 7, 6, 5, 4);
        System.out.println("시작 배열 : " + list);
        for(int times = 1; times < list.size(); times++) {
            var targetPos = times;
            var target1   = list.get(targetPos);       //기준
            var pos       = times - 1;   //정렬된 가장 큰 값 순번

            System.out.print(target1 + " ");  //기준값 출력
            //정렬된 왼쪽 배열과 비교
            for(int idx = pos; idx >= 0; idx--) {
                var target2 = list.get(idx);
                if(target1 < target2) {
                    list.set(targetPos, target2);
                    list.set(idx, target1);
                    targetPos = idx;
                }
            }
            System.out.println(list);
        }
    System.out.println("최종 배열 : " + list);
    }
}
