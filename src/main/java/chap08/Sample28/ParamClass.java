package chap08.Sample28;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class ParamClass {
    private final String name;
    private final Integer age;
    
    public ParamClass(String name, Integer age) {
        if(age < 20) {
            throw new IllegalArgumentException("미성년자 출입금지");
        }
        this.name = name;
        this.age = age;
    }
    
    public String nameToUpperCase() {
        return this.getName().toUpperCase();
    }
}
