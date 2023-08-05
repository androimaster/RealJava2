package chap17;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Sample11 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long processTime1 = System.currentTimeMillis();
        IntStream.rangeClosed(65, 74)
                 .forEach(x -> System.out.println(
                          Thread.currentThread().getName() + " - " + (char)x));
        System.out.println("직렬 스트림 출력 시간 - " 
                          + (System.currentTimeMillis() - processTime1));
        
        long processTime2 = System.currentTimeMillis();
        new ForkJoinPool(2).submit( () ->
            IntStream.rangeClosed(65, 74).parallel()
                     .forEach(x -> System.out.println(
                          Thread.currentThread().getName() + " - " + (char)x))
        ).get();
        System.out.println("병렬 스트림 출력 시간 - " 
                          + (System.currentTimeMillis() - processTime2));
    }
}
