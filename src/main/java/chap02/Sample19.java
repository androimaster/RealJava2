package chap02;

import java.util.UUID;

public class Sample19 {
    public static void main(String[] args) {
        UUID id = UUID.randomUUID();
        System.out.println(id);
        System.out.println(id.toString().replaceAll("-", ""));
    }
}
