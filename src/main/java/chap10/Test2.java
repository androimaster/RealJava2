package chap10;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        CubeBox<String> stringList = new CubeBox<>();
        stringList.add("Iron man");
        stringList.add("Captain America");
        stringList.add("Thor");
        System.out.println(stringList.toString());

        CubeBox<Integer> numberlist = new CubeBox<>();
        numberlist.add(1);
        numberlist.add(2);
        System.out.println(numberlist.toString());
    }
}

class CubeBox<E> {
    private int listCount = 0;

    Object[] customList = new Object[0];

    public boolean add(E e) {
        listCount++;
        customList = Arrays.copyOf(customList, listCount);
        customList[listCount-1] = e;
        return true;
    }

    @Override
    public String toString() {
        return "CubeBox = " + Arrays.toString(customList);
    }
}