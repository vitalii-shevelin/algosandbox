package examples.threads;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PingPong {

    public static void main(String[] ars) {
        final AtomicInteger turns = new AtomicInteger(20);
        final Object ball = new Object();
/*
        new Thread(() -> {
            synchronized (ball){
                try {
                    while(turns.getAndDecrement() > 0) {
                        System.out.println("ping");
                        ball.notify();
                        ball.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ball.notifyAll();
            }
        }).start();
        new Thread(() -> {
            synchronized (ball) {
                while (turns.getAndDecrement() > 0) {
                    System.out.println("pong");
                    ball.notify();
                    try {
                        ball.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ball.notifyAll();
            }
        }).start();


        final StringBuilder b = new StringBuilder();
        "abcde".chars().forEach(b::append);
        System.out.println(b.toString());*/

        int initialCapacity = 8;
        // Find the best power of two to hold elements.
        // Tests "<=" because arrays aren't kept full.
        if (50 >= initialCapacity) {
            initialCapacity = 50;
            initialCapacity |= (initialCapacity >>>  1);
            initialCapacity |= (initialCapacity >>>  2);
            initialCapacity |= (initialCapacity >>>  4);
            initialCapacity |= (initialCapacity >>>  8);
            initialCapacity |= (initialCapacity >>> 16);
            initialCapacity++;

            if (initialCapacity < 0)   // Too many elements, must back off
                initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements
        }
        System.out.println(initialCapacity);

    }


}
