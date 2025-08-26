package edu.practice.day2;

import java.util.Scanner;

public class Practice2 {
    Scanner sc = new Scanner(System.in);

    public void method2() {
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
