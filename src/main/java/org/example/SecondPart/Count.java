package org.example.SecondPart;

public class Count implements Runnable{


    @Override
    public void run() {
        for (int i = 1; i < 11; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Number countdown: " + i + " Thread name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
