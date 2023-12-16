package chap10;

public class Test3 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("KEY", 24);
        System.out.println("%s : %d".formatted(pair.getKey(), pair.getValue()));
    }
}

class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
}
