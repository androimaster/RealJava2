package chap08.Sample03;

public class Data {
    int value;

    void setValue(int val) {
        value = val;  //매개변수 val를 멤버 변수 value에 대입, this를 사용안해도 됨
    }

    int getValue() {
        return value;
    }
}
