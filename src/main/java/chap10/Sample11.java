package chap10;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample11 {
    public static void main(String[] args) {
        Student1<Integer, Integer> seohyun = new Student1<>(1, 4);
        //Student1<Double, Double> seohyun = new Student1<>(160.1 , 55.5); // 타입 제한으로 오류발생
        seohyun.printInfo("서현");
    }
}

@Getter
@AllArgsConstructor
class Student1<G extends Integer, C extends Integer> {
    G g;
    C c;

    public void printInfo(String name) {
        System.out.println(name + "은(는) " + g + " 학년 " + c + "반 ");
    }
}
