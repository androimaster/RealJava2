package chap04;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("두개의 수를 띄어쓰기하여 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);

        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = (in1 > in2) ? in1 : (in1 == in2) ? 0 : in2;
        System.out.printf("입력한 값 중 큰 수는 %d 입니다.", result);
    }
}
