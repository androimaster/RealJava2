package chap10;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample10 {
    public static void main(String[] args) {
        Student<Integer, Integer> seohyun = new Student<>(5, 4);
        seohyun.printInfo("서현");
    }
}

@Getter
@AllArgsConstructor
class Student<G, C> {
    G g;
    C c;

    public void printInfo(String name) {
        System.out.println(name + "은(는) " + g + " 학년 " + c + "반 ");
    }
}
