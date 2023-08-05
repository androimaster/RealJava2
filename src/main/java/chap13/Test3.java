package chap13;

import java.util.Calendar;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test3 {
    public static void main(String[] args) {
        DAYS today = DAYS.findEqualsName(Calendar.DAY_OF_WEEK);
        System.out.printf("오늘은 %s입니다.", today.getWeeknm());
    }
}

@Getter
@AllArgsConstructor
enum DAYS {
    WEEK("요일"), SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");
    private String weeknm;
    
    public static DAYS findEqualsName(int today) {
        DAYS returnDay = null;
        for(DAYS d : DAYS.values()) {
            if(today == d.ordinal()) {
                returnDay = d;
                break;
            }
        }
        return returnDay;
    }
}