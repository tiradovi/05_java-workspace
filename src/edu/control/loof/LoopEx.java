package edu.control.loof;

import java.util.Scanner;

/**
 * 루프 기능 설정용 클래스
 */
public class LoopEx { // <html>과 같이 페이지 내 코드 시작을 나타내는 구문
  /** 코드에 대한 설명 작성시 사용하는 주석
   *
   */
  /**
   * 1부터 10 까지 출력하기
   */
  public void method1() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);
    }
  }

  /**
   * 첫 번째 입력 받은 수부터 두 번째 입력받은 수까지 1씩 증가하며 출력
   */
  public void method2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫 번째 숫자를 입력하세요");
    int input1 = sc.nextInt();
    System.out.println("두 번째 숫자를 입력하세요");
    int input2 = sc.nextInt();

    for (int i = input1; i <= input2; i++) {
      System.out.println(i);
    }

  }

  /**
   * 두 수를 입력받아 1씩 증가하며 반복 출력하기 입력받은 두수 중에서 작은값이 초기식 큰 값이 조건식에 사용되게 작성 같은 경우 초기식이 a 변수 조건식이 b 변수이름
   */
  public void method3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫 번째 숫자를 입력하세요");
    int a = sc.nextInt();
    System.out.println("두 번째 숫자를 입력하세요");
    int b = sc.nextInt();

    if (a <= b) {
      for (int i = a; i <= b; i++) {
        System.out.println(i);
      }
    } else {
      for (int i = b; i <= a; i++) {
        System.out.println(i);
      }

    }


  }

  /**
   * 최대 최소 구하기 Math.min(a,b) Math.max(a,b)
   *
   */
  public void method4() {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫 번째 숫자를 입력하세요");
    int a = sc.nextInt();
    System.out.println("두 번째 숫자를 입력하세요");
    int b = sc.nextInt();

    int min = Math.min(a, b);
    int max = Math.max(a, b);

    for (int i = min; i <= max; i++) {
      System.out.println(i);
    }
  }
}//</html> 과 같이 페이지 내 코드 종료를 나타내는 구문

/*
  주의할 점 html 코드는 오류 최소화 기반, 따라서 html 태그 밖에서도 문제 발생 X
  java 코드는 코드 규칙 준수 기반, 따라서 public class 밖에서 문제 발생 O
 */
