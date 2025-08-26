package edu.practice.day2;

import java.util.Scanner;

public class Practice4 {
    Scanner sc = new Scanner(System.in);

    public void method4() {
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + "는 소수입니다.");
        } else {
            System.out.println(number + "는 소수가 아닙니다.");
        }
    }
}
