package chap13;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DAYS today = DAYS.findEqualsName(now.getDayOfWeek().toString());
        System.out.printf("오늘은 %s입니다.", today.getWeeknm());
    }
}

@Getter
@AllArgsConstructor
enum DAYS {
    SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");
    private String weeknm;
    
    public static DAYS findEqualsName(String today) {
        DAYS returnDay = null;
        for(DAYS d : DAYS.values()) {
            if(today.equals(d.toString())) {
                returnDay = d;
                break;
            }
        }
        return returnDay;
    }
}