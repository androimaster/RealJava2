package chap07;

public class Test1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 20 - 10);
            if(num > 0) {
                System.out.printf("%d은(는) 양수입니다.\n", num);
            }
            else if(num == 0) {
                System.out.printf("%d은(는) 0입니다.\n", num);
            }
            else {
                System.out.printf("%d은(는) 음수입니다.\n", num);
            }
        }
    }
}
