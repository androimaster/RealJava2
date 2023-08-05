package chap08.Sample22;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String color;        //차량색상
    private int    doors;        //문 수
    private String manufacturer; //제조사

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("빨강");
        String str = "차량의 색상은 %s입니다.".formatted(car.getColor());
        System.out.println(str);
    }
}
