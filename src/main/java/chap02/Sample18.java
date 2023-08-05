package chap02;

/**
 * 난수를 학습합니다.
 * @author andro
 */
public class Sample18 {
    /**
     * 난수를 생성해서 출력하는 예제입니다.
     * @param args
     * @since 1.0  
     */
    public static void main(String[] args) {
        int num = (int)(Math.random() * 3 + 1);
        System.out.println("난수 : %d" +  num);
    }
}
