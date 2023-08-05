package chap07;

public class Sample11 {
    public static void main(String[] args) {
        int in = 6;
        String var10000;
        switch (in) {
            case 1 :
            case 2 :
            case 12 :
                var10000 = "겨울";
                break;
            case 3 :
            case 4 :
            case 5 :
                var10000 = "봄";
                break;
            case 6 :
            case 7 :
            case 8 :
                var10000 = "여름";
                break;
            case 9 :
            case 10 :
            case 11 :
                var10000 = "가을";
                break;
            default :
                var10000 = "기후온난화";
        }

        String season = var10000;
        System.out.println(season);
    }
}
