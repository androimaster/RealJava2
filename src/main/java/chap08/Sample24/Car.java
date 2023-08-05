package chap08.Sample24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {
    @NonNull
    private String color;        //차량색상
    private int    doors;        //문 수
    private String manufacturer; //제조사    

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("빨강");
        car1.setDoors(5);
        car1.setManufacturer("세계로 뻗어가는 빵공장");
        System.out.println(car1);
        
        Car car2 = new Car("검정", 4, "기어코 성공하는 공장");
        System.out.println(car2);
        
        Car car3 = new Car("파랑");
        car3.setDoors(2);
        car3.setManufacturer("가족같은 대우해주는 공장");
        System.out.println(car3);
    }
}
