package chap09;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Data asc = new AscData();
        asc.setData(1, 2, 6, 9, 4);
        asc.sort();
        System.out.println("오름차순 : " + asc.toString());
        Data des = new DesData();
        des.setData(1, 2, 6, 9, 4);
        des.sort();
        System.out.println("내림차순 : " + des.toString());
    }
}

abstract class Data {
    Integer[] data;

    public void setData(Integer... data) {
        this.data = data;
    }

    public abstract void sort();

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

class AscData extends Data {
    @Override
    public void sort() {
        //Ascending
        Integer tmp;
        for(int i = 0; i < data.length - 1; i++) {
            for(int idx = i + 1; idx < data.length; idx++) {
                if(data[i] > data[idx]) {
                    tmp = data[i]; 
                    data[i] = data[idx];
                    data[idx] = tmp;
                }
            }
        }
    }
}

class DesData extends Data {
    @Override
    public void sort() {
        //Descending
        Integer tmp;
        for(int i = 0; i < data.length - 1; i++) {
            for(int idx = i + 1; idx < data.length; idx++) {
                if(data[i] < data[idx]) {
                    tmp = data[i]; 
                    data[i] = data[idx];
                    data[idx] = tmp;
                }
            }
        }
    }
}