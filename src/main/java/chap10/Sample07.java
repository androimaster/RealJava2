package chap10;

public class Sample07 {
    public static void main(String[] args) {
        Sample06<Integer> age = new Sample06<Integer>();
        Sample06<String> name = new Sample06<String>();

        age.setT(18);
        name.setT("빵형");

        int    personAge  = age.getT();
        String personName = name.getT();

        System.out.printf("%s은(는) %d살", personName, personAge );
    }
}
