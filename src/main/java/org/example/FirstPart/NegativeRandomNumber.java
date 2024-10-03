package org.example.FirstPart;

import java.util.Random;

public class NegativeRandomNumber implements Runnable{
    Random random;

    @Override
    public void run() {
        random = new Random();
        System.out.println(Thread.currentThread().getName() + " " +random.nextInt(0,100));

    }
}
