package chap04;

public class Sample13 {
    public static void main(String[] args) {
        int a = 60; // 0000 0000 0000 0000 0000 0000 0011 1100
        int b = -10;// 1111 1111 1111 1111 1111 1111 1111 0110
        System.out.println("* >>");
        System.out.printf("[%32s] >> 4 [%32s] = %d\n"
            , Integer.toBinaryString(a), Integer.toBinaryString(a >> 4), a >> 4);
        System.out.printf("[%32s] >> 4 [%32s] = %d\n"
            , Integer.toBinaryString(b), Integer.toBinaryString(b >> 4), b >> 4);
    }
}