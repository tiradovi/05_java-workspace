package edu.op.ex;

// 폴더위치 + 파일이름 생성방법
// .활용해서 폴더 구분후 파일 명칭 작성

import java.util.Scanner;

/**
 * 기능 작성용 클래스
 */
public class OperatorEx {

  /**
   * 자바에서는 모든 기능을 class 내부에 작성하기 때문에 대부분의 기능을 메서드 형태로 사용 파일이름.기능이름()
   */
  // 메서드 호출 테스트
  public void test() {
    System.out.println("test");
  }

  /**
   * 입력 받은 정수가 3의 배수가 맞는지 확인하는 기능
   */
  public void method1() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isTrue;
    if (num % 3 == 0) {
      isTrue = true;
      System.out.printf("%d는 3의 배수입니다. : %b", num, isTrue);
    } else {
      isTrue = false;
      System.out.printf("%d는 3의 배수가 아닙니다. : %b", num, isTrue);
    }
  }
}
