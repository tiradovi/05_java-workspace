package edu.control.loof;

import java.util.Scanner;

/**
 * 루프 기능 설정용 클래스 문자열 / while 문 기능 작성
 */
public class LoopEx3 {

  Scanner sc = new Scanner(System.in);

  /**
   * 문자열 한글자씩 출력하기
   */
  public void method1() {
    String str = "Hello World";

    for (int i = 0; i < str.length(); i++) {
      System.out.println("i의 값:" + i);
      System.out.println("i 위치의 문자 값:" + str.charAt(i));
      /*
      str은 문자열이기에 문장 전체에서 자리를 바라본다는 것 자체가 문제
       System.out.println("i 위치의 문자 값:" + str(i));
       */
    }
  }

  //while(조건식): 끝이 확실하지 않은 반복

  /**
   * -1이 입력될 때까지 정수를 계속 입력받아 입력받은 수의 합계 구하기 변수이름 int sum=0; 합계 누적용 변수 int input = 0; 입력 값을 저장할 변수
   */
  public void method2() {
    int sum = 0;
    int count = 0;
    int input = sc.nextInt();

    while (input != -1) {
      count++;
      sum += input;
      input = sc.nextInt();
    }
    System.out.println(sum);
    System.out.println(count);
  }

}
