package chap08.Sample23;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String color;        //차량색상
    private int    doors;        //문 수
    private String manufacturer; //제조사

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("빨강");
        car.setDoors(5);
        car.setManufacturer("세계로 뻗어가는 빵공장");
        System.out.println(car);
    }
}
