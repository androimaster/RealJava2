package chap07;

public class Sample12 {
    public static void main(String[] args) {
        int in = 6;  //입력 월

        String season = switch(in) {
            case 12, 1, 2 -> {
                String str = "겨울";
                yield str;
            }
            case 3, 4, 5  -> "봄";
            case 6, 7, 8  -> "여름";
            case 9, 10, 11 -> "가을";
            default        -> "기후온난화";
        };

        System.out.println(season);
    }
}
