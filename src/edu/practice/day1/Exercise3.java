package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {

  public void method3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("섭씨온도를 입력하세요:");
    double celsius = sc.nextDouble();
    final double RATIO = 9.0 / 5.0;
    final int OFFSET = 32;
    double fahrenheit = celsius * RATIO + OFFSET;

    System.out.println("섭씨" + celsius + " 도는 화씨" + fahrenheit + "도입니다.");
  }
}
