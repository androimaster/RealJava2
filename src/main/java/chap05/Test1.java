package chap05;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String 서비스개발팀  = "서비스개발팀";
        String 인프라개발팀  = "인프라개발팀";
        String BA팀     = "BA팀";
        String[] IT지원부서 = new String[3];
        IT지원부서[0] = 서비스개발팀;
        IT지원부서[1] = 인프라개발팀;
        IT지원부서[2] = BA팀;
        System.out.printf("IT지원부서는 %s으로 구성되어 있습니다.", Arrays.toString(IT지원부서));
    }
}
