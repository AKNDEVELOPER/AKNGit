package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //0=ROCK
        //1=PAPER
        //2=SCISSOR

        System.out.println("Press '0' for ROCK");
        System.out.println("Press '1' for PAPER");
        System.out.println("Press '2' for SCISSOR");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            Random rand = new Random();
            int rand_int1 = rand.nextInt(3);

            System.out.println(rand_int1);

        if (a>3) {
            System.out.println("Sorry! You Lost you Entered Wrong Number");
        }
        if (rand_int1==a)
        {
            System.out.println("OOPS! Tie , Replay");
        }

            if (rand_int1 == 0 && a == 2 || rand_int1 == 1 && a == 0 || rand_int1 == 2 && a == 1) {
                System.out.println("You Lost , Sorry! , Better Luck Next Time");
            }
            else if (rand_int1 == 2 && a == 0 || rand_int1 == 0 && a == 1 || rand_int1 == 1 && a == 2){
                System.out.println("You Won , Congratulation! , Keep Going");
            }
    }
}
