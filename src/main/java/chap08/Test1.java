package chap08;

public class Test1 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10 + 1);
            System.out.println("난수: %d, 합: %d".formatted(num, sum(num)));
    }

    public static int sum(int in) {
        int ret;
        if(in > 0) {
            ret = in + sum((in-1));
        }
        else {
            ret = 0;
        }
        return ret;
    }
}
