package chap02;

public class Sample08 {
    public static void main(String[] args) {
        short a = 32767; //short 최댓값
        int b = 500000;
        
        b = a; //묵시적 형 변환
        System.out.println(b);
    }
}
