package chap02;

public class Sample14 {
    public static void main(String[] args) {
        //var name; //자료형을 추론할 때 리터럴이 없으면 추론할 수 없어서 에러가 발생
        var name = "나어때";
        var age = 28;
        var height = 159.9f;
        
        System.out.printf("이름 : %s [%s]\n", name, ((Object)name).getClass().getSimpleName());
        System.out.printf("나이 : %d [%s]\n", age, ((Object)age).getClass().getSimpleName());
        System.out.printf("키 : %f [%s]", height, ((Object)height).getClass().getSimpleName()); 
    }
}