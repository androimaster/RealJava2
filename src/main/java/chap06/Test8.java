package chap06;

public class Test8 {
    public static void main(String[] args) {
        String[] nation = {"캐나다", "한국", "베트남", "독일", "영국", "인도"};
        String   formatStr = "나는 %s에 가고 싶다";
        for(String str : nation) {
             System.out.println(formatStr.formatted(str));
        }
    }
}
