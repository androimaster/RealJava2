package chap08.Sample28;

public class Sample28 {
    public static void main(String[] args) {
        ParamClass p1 = new ParamClass("bread", 26);
        System.out.println(p1);
        System.out.println(p1.nameToUpperCase());
        
        ParamRecord p2 = new ParamRecord("bread", 19);
        System.out.println(p2);
        System.out.println(p2.nameToUpperCase());
    }
}
