package chap02;

/**
 * <p>char 자료형에 대해서 학습합니다.</p>
 * <p>첫 번째 p tag만 description에 보여집니다.
 * @author andro
 */
public class Sample01 {

    /**
     * char 자료형에 대해서 실습합니다.
     * @param args
     * @since 1.0  
     */
    public static void main(String[] args) {
        char chr = 'A';
        System.out.println("char : " + chr);          // 문자
        System.out.println("Encoding : " + (int)chr); // ASCII 코드로 출력
        System.out.println("Decoding : " + (char)65); // 문자로 출력
    }

    /**
     * <p>생성자의 설명을 적습니다.</p>
     * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다.</p>
     */
    public Sample01() { }
}
