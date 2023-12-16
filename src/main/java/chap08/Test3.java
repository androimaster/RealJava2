package chap08;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(concat("아버지가", "방에들어가신다"));
        System.out.println(concat("동창이", "밝았느냐", "노고지리", "우지진다"));
    }

    public static String concat(String... words) {
        String result = "";

        for(String w : words) {
            result += w;
        }
        return result;
    }
}
