package chap02;

public class Sample09 {

    public static void main(String[] args) {
        int a = 65;
        byte b = (byte)a; //정수를 byte로 명시적 형 변환 
        System.out.println(b);
        
        b = (byte) (a + 1); //a + 1 정수 연산 후 byte로 명시적 형 변환
        System.out.println(b);
        
        a = b; //byte b를 더 큰 범위를 갖은 int a에 자동 형 변환
        System.out.println(a);
        
        b = (byte)a; //int a를 byte b의 작은 범위인 byte로 명시적 형 변환
        System.out.println(b);
    }
}
