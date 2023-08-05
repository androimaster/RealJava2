package chap08.Sample03;

public class Sample03 {
    public static void main(String[] args) {
        Data data = new Data();
        data.setValue(10);  //인자로 10을 넘김		
        System.out.println(data.getValue());

        Compute cmpt = new Compute();
        cmpt.setValue(4);
        cmpt.setValue(10, 2);
        System.out.println(cmpt.getValue());
    }
}
