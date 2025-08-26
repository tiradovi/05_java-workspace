package edu.practice.day2;

import java.util.Scanner;

public class Practice1 {

    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.print("첫 번째 숫자: ");
        int input1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int input2 = sc.nextInt();
        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        System.out.println(min + "부터 " + max + "까지의 짝수");
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
