package chap15;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        List list = new ArrayList<String>();

        //대상 문자열
        String str   = "홍길동 010-1111-2222^고길동 011-222-2222^도우너016-2513-4574^또치 019-7777-0114^둘리 010-7777-7777";
        String regex = "[[01(?:0|1|[6-9])[-]([0-9]{3}|[0-9]{4})[-][0-9]{4}]]*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while (m.find()) {
            if(!"".equals(m.group())) list.add(m.group());
        }
        System.out.println(list.toString());
    }
}
