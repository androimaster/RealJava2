package chap10;

import lombok.Builder;

public class Test1 {
    public static void main(String[] args) {
        Person superman = Person.builder()
                                .name("슈퍼맨")
                                .age(32)
                                .height(190)
                                .weight(100)
                                .phone("1511-1151")
                                .build();

        System.out.println(superman.toString());
    }
}

@Builder
record Person(String name, int age, float height, float weight, String phone) {}