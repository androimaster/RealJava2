package chap13;

import java.time.LocalDate;

public class Sample13 {
    public static void main(String[] args) {
    	LocalDate time1 = LocalDate.parse("2024-12-25");
    	LocalDate time2 = LocalDate.now();
        
    	//time1이 time2보다 이전인가?
        System.out.println(time1.isBefore(time2));
        //time1이 time2보다 이후인가?
        System.out.println(time1.isAfter(time2));
        //time1이 time2와 같은가?
        System.out.println(time1.isEqual(time2));
    }
}
