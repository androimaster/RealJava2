package chap02;

public class Sample15 {
    public static void main(String[] args) {
        final float PI; // 정의하지 않고 PI를 상수로 선언했다.
        PI = 3.14f; // 최초 값을 선언한다. 이 후 PI값을 변경하면 오류가 발생한다.
        //PI = 3.14f; // The final local variable PI may already have been assigned
        int radius = 10;
        
        float area = radius * radius * PI;
        
        System.out.printf("원의 넓이 : %f", area);
    }
}