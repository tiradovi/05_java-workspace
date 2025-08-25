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
    boolean isTrue = (num % 3 == 0);
    System.out.printf("%d는 3의 배수입니다. : %b", num, isTrue);
    System.out.println();
  }

  /*
   void는 반환값 X
   자바라는 언어는 바구니에 들어갈 데이터가 숫자, 문자, 사람이 만든 크기, 실수 등 데이터를 담을 변수이름의 종류부터

   기능을 실행할 때
   - 기능을 실행만 하면되는 것인지?
      public void 기능명칭(매개변수, 파라미터 자리){
      기능
      }
   - 기능을 실행 후 실행 결과를 어딘가에 전달하는 기능인지
      public 전달할자료형 기능명칭(매개변수, 파라미터 자리){
      기능
      return 전달할 데이터;
      }
   프로그램 수행전에 정의해야할 사항이 많음

   */
  public void method2() {
    // Scanner는 1회만 호출후 사용 여러번 가능
    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    int input2 = sc.nextInt();

    boolean isTrue = (input1 % input2 == 0);

    System.out.printf("%d는 %d의 배수가 맞는지? %b", input1, input2, isTrue);
    System.out.println();
  }

  public void method3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력 :");
    int input = sc.nextInt();

    //삼항 연산자 : 조건식 ? 참 : 거짓;
    // if (){} else {} 를 줄인 연산식
    boolean isTrue = (input % 2 == 0);

    String result = isTrue ? "짝수" : "홀수";
    System.out.printf("%d은 %s입니다.", input, result);

  }
}
