package org.example;


import org.example.Fifth.Counter;
import org.example.FirstPart.CapitalRandomLetter;
import org.example.FirstPart.LowercaseRandomLetter;
import org.example.FirstPart.NegativeRandomNumber;
import org.example.FirstPart.PositiveRandomNumber;
import org.example.Fourth.CountFive;
import org.example.SecondPart.Count;

import java.sql.SQLOutput;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        /////////////////////////////////////////////////////////////////////////////
        /////////////////////// First problem ///////////////////////////////////////

        System.out.println("First problem");
        System.out.println();

        Thread thread01 = new Thread(new CapitalRandomLetter(),"CapLetter");
        Thread thread02 = new Thread(new LowercaseRandomLetter(),"LowLetter");
        Thread thread03 = new Thread(new NegativeRandomNumber(),"CapLetter");
        Thread thread04 = new Thread(new PositiveRandomNumber(),"CapLetter");


        System.out.println(thread01.getName());
        thread01.start();

        System.out.println(thread02.getName());
        thread02.start();

        System.out.println(thread03.getName());
        thread03.start();

        System.out.println(thread04.getName());
        thread04.start();

        /////////////////////////////////////////////////////////////////////////////
        /////////////////////// Second problem //////////////////////////////////////

        Thread.sleep(1000);

        System.out.println();
        System.out.println("Second problem");
        System.out.println();

        Thread thread05 = new Thread(new Count(),"Count1");
        Thread thread06 = new Thread(new Count(),"Count2");

        thread05.start();
        thread06.start();

        /////////////////////////////////////////////////////////////////////////////
        /////////////////////// Third problem //////////////////////////////////////

        Thread.sleep(11000);

        System.out.println();
        System.out.println("Third problem");
        System.out.println();

        for (int i = 1; i < 5 ; i++){
         Thread temp = new Thread(new Count(),"Count Again " + i);
         temp.start();
           // new Thread(new Count(),"CountAgain" + i).start();
        }

        /////////////////////////////////////////////////////////////////////////////
        /////////////////////// Fourth problem //////////////////////////////////////


        Thread.sleep(11000);

        System.out.println();
        System.out.println("Fourth problem");
        System.out.println();

        for (int i = 1; i < 5 ; i++){
            Thread temp = new Thread(new CountFive(),"Count Again And Again " + i);
            temp.start();

        }


        /////////////////////////////////////////////////////////////////////////////
        /////////////////////// Fifth problem //////////////////////////////////////


        Thread.sleep(11000);

        System.out.println();
        System.out.println("Fifth problem");
        System.out.println();

        boolean winner = true;
        for (int i = 1; i < 5 ; i++){
            Thread temp = new Thread(new Counter(),"Runner: " + i);
            temp.start();
        }










    }
}