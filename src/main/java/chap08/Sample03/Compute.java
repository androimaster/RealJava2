package chap08.Sample03;

public class Compute {
    int result;

    void setValue(int val) {
        result += val;
    }

    void setValue(int val1, int val2) {
        result += val1 + val2;
    }

    int getValue() {
        return result;
    }
}
