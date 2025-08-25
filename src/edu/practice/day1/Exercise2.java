package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {

  public void method2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫 번째 정수 입력: ");
    int num1 = sc.nextInt();
    System.out.println("두 번째 정수 입력: ");
    int num2 = sc.nextInt();

    int add = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    double div = (double) num1 / num2;

    System.out.println("=== 계산 결과 ===");
    System.out.printf("%d + %d = %d\n", num1, num2, add);
    System.out.printf("%d - %d = %d\n", num1, num2, sub);
    System.out.printf("%d * %d = %d\n", num1, num2, mul);
    System.out.printf("%d / %d = %.2f\n", num1, num2, div);

  }
}
