package chap04;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.print("0~100 사이의 학점을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt(); //입력받은 값을 가져온다.
        String score = "";     //변환할 학점을 담을 변수 생성
        score = (in >= 90) ? "A" :
                    (in >= 80) ? "B" :
                        (in >= 70) ? "C" :
                            (in >= 60) ? "D" : "F";

        System.out.printf("학점 (%d)은 %s입니다.", in, score );
    }
}
