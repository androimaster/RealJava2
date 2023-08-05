package chap08.Sample28;

public record ParamRecord(String name, Integer age) {
    public String nameToUpperCase() {
        return this.name().toUpperCase();
    }
    
    public ParamRecord {
        if(age < 20) {
            throw new IllegalArgumentException("미성년자 출입금지");
        }
    }
}