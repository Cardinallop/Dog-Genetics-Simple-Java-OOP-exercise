/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boburmurtozaev;

/**
 *
 * @author boburmurtozaev
 */
import java.util.Scanner;

public class DogGenetics_1 {

    public static void main(String[] args) {

        boolean driver = true;
        String trial;

        do {

            String dogName;
            int st;
            int ch;
            int dr;
            int cc;
            int kd;
            int sum;
            int count = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("What's your dog's name?");

            dogName = scan.nextLine();

            System.out.println("\nWell then, "
                    + "I have this highly reliable report on Sir "
                    + "" + dogName + "'s prestigious background right here.\n\n");
            System.out.println("Sir " + dogName + " is:\n\n");

            while (true) {

                st = (int) (Math.random() * 100);
                ch = (int) (Math.random() * 100);
                dr = (int) (Math.random() * 100);
                cc = (int) (Math.random() * 100);
                kd = (int) (Math.random() * 100);
                sum = (st + ch + dr + cc + kd);
                count++;

                if (sum == 100) {
                    break;
                }

            }

            System.out.println("Research run count: " + count+"\n");

            System.out.println(st + "% St. Bernard\n" + ch + "% "
                    + "Chihuaha\n" + dr + "% Dramatic RedNosed "
                    + "Asian Pug\n" + cc + "% Common Cur\n" + kd + "% "
                    + "King Doberman\n\nWow, that's QUITE the dog!\n\n");

            System.out.println("Try again? Yes/No");

            while (true) {
                trial = scan.next();
                if ((trial.equalsIgnoreCase("no")) || (trial.equalsIgnoreCase("yes"))) {
                    break;
                } else {
                    System.out.println("Please, type in either yes or no");
                }
            }
            if (trial.equalsIgnoreCase("no")) {
                //break bigloop;// you can use named break points to break of out certain loops
                driver = false;
            } else if (trial.equalsIgnoreCase("yes")) {
                System.out.println("Initiating genetic analysis.....");
                driver = true;

            }

        } while (driver);

    }

}
