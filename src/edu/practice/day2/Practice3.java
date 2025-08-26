package edu.practice.day2;

import java.util.Scanner;

public class Practice3 {
    Scanner sc = new Scanner(System.in);

    public void method3() {
        System.out.print("팩토리얼을 구할 숫자를 입력하세요");
        int number = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);


    }

}
