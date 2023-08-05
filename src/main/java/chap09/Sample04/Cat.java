package chap09.Sample04;

public class Cat extends Pet{
    //생성자의 내용을 부모클래스로 값을 넘겨서 객체 생성한다
    public Cat(boolean wing, int legCount) {
        super(wing, legCount);
    }

    @Override
    public void run(String name) {
        System.out.printf("%s는 소리없이 조용하게 뜁니다.%n", name);
    }
}
