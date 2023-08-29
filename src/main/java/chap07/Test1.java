package chap07;

public class Test1 {
    public static void main(String[] args) {
        Integer[] numbers = {-1, 7, 4, -8};
        
        for(int number : numbers) {
            if(number > 0) {
                System.out.printf("%d는 양수입니다.\n", number);
            }
            else {
                System.out.printf("%d는 음수입니다.\n", number);
            }
        }
    }
}
