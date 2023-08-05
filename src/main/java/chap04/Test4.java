package chap04;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값을 입력하세요 : ");
        int in = sc.nextInt(); //입력받은 값을 가져온다.

        System.out.printf("출력값 : %d%n%n", (in > 0)? in : in * -1  );

        System.out.print("정수값을 입력하세요 : ");
        in = sc.nextInt(); //입력받은 값을 가져온다.
	
        System.out.printf("출력값 : %d%n", (in > 0)? in : in * -1  );
    }
}
