package chap09;

public class Test3 {
    public static void main(String[] args) {
        Smartphone i = new Iphone();
        Androidphone a = (Androidphone)i;
    }
}

abstract class Smartphone {}

class Iphone extends Smartphone {}

class Androidphone extends Smartphone {}