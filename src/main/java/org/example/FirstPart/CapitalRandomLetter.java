package org.example.FirstPart;

import java.util.Random;

public class CapitalRandomLetter  implements Runnable{

    Random random;

    @Override
    public void run() {
        random = new Random();

        System.out.println(Thread.currentThread().getName() + " " + (char) random.nextInt(65,90));

    }
}
