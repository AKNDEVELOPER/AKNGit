package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float rebate;
        int n=0;
        while (n!=-1) {
            Scanner sy = new Scanner(System.in);
            n=sy.nextInt();
            Scanner sc = new Scanner(System.in);
            float income = sc.nextFloat();
            if (income <= 250000f) {
                System.out.println("You are not Applicable to pay Tax");
            } else if (income > 250000f && income <= 500000f) {
                rebate=sc.nextFloat();
                income = income - 250000f;
                float tax = 5f / 100f * (income-rebate);
                System.out.println("You have to pay Rs" + tax);
            } else if (income > 500000f && income <= 1000000f) {
                rebate=sc.nextFloat();
                float tax1 = 5f / 100f * (500000f - 250000f);
                float tax2 = tax1 + (20f / 100f * (income - 500000f- rebate));
                System.out.println("You have to pay Rs" + tax2);
            } else if (income > 1000000f) {
                rebate=sc.nextFloat();
                float tax4 = 5f / 100f * (500000f - 250000f);
                float tax5 = 20f / 100f * (1000000f - 500000f);
                float tax6 = tax4 + tax5 + 30f / 100f * (income - 1000000f-rebate);
                System.out.println("You have to pay Rs" + tax6);
            }
        }
    }
}
