package chap17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample13 {
    public static void main(String[] args) {
        Stream.of("낙화", "최정환", "뿜뿜", "out standing")
              .forEach(name -> System.out.printf(" %s", name));
        System.out.println();
        Arrays.asList("낙화", "최정환", "뿜뿜", "out standing").stream()
              .forEach(name -> System.out.printf(" %s", name));
    }
}
