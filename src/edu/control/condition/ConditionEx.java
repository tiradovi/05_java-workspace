package edu.control.condition;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {

  public void method1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("나이를 입력하세요");
    int age = sc.nextInt();

    if (age > 18) {
      System.out.println("성인입니다.");
    } else {
      System.out.println("성인이 아닙니다.");
    }
  }

  public void method2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("나이를 입력하세요");
    int age = sc.nextInt();
    String result = "";

    if (age < 13) {
      result = "어린이";
    }
    if (age > 13 && age < 18) {
      result = "청소년";
    }
    if (age > 18) {
      result = "성인";
    }

    System.out.println(result);
  }

  public void method3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("달을 입력하세요");
    int month = sc.nextInt();
    String result = "";

    switch (month) {
      case 3, 4, 5:
        result = "봄";
        break;
      case 12, 1, 2:
        result = "겨울";
        break;
      case 6, 7, 8:
        result = "여름";
        break;
      case 9, 10, 11:
        result = "가을";
        break;
      default:
        result = "입력 확인";
        break;
    }
    System.out.println(result);
  }

  public void method4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("달을 입력하세요");
    int month = sc.nextInt();
    String result;

    if (month < 1 || month > 12) {
      System.out.println("잘못 입력하였습니다.");
      return;
    }
    if (month >= 3 && month <= 5) {
      result = "봄";
    } else if (month >= 6 && month <= 8) {
      result = "여름";
    } else if (month >= 9 && month <= 11) {
      result = "가을";
    } else {
      result = "겨울";
    }
    System.out.println(result);
  }
}
