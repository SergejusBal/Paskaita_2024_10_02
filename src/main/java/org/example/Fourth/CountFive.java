package org.example.Fourth;

import java.util.Random;

public class CountFive implements Runnable{

    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(500,2000);
        for (int i = 1; i < 6 ; i++){
            try {
                Thread.sleep(randomNumber);
                System.out.println("Number countdown: " + i + " Thread name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
