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

  /**
   * 0이 입력될 때까지 정수를 계속 입력받아 입력받은 수의 합계 구하기
   */
  public void method3() {
    int sum = 0;
    int input = 0;
    System.out.println("0 입력시 종료");
    while (true) {
      System.out.println("정수를 입력하세요");
      input = sc.nextInt();

      if (input == 0) {
        break;
      }
      sum += input;
    }
    System.out.println("정수의 합:" + sum);
  }

  //do ~ while: 조건식이 뒤에 작성된 while문 최소 1회 반복

  /**
   * 0이 입력될 때까지 정수를 계속 입력받아 입력받은 수의 합계 구하기
   */
  public void method4() {
    int sum = 0;
    int input = 0;
    do {
      System.out.println("정수를 입력하세요");
      input = sc.nextInt();
      sum += input;
    } while (input != 0);
    System.out.println("정수의 합 :" + sum);
  }

  /**
   * 문자열을 입력받아 i-- 를 활용하여 거꾸로 출력 String.charAt() + for 문 활용
   */
  public void method5() {
    System.out.println("문자열을 입력하세요:");
    String str = sc.nextLine();

    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    System.out.println();
  }

  /**
   * 1~10 사이에 랜덤 숫자를 맞출 때까지 반복 Math.random() 변수 이름 int answer, input, count Math.random() 0.0~1.0까지의
   * double 소수 타입
   */
  public void method6() {
    int answer = (int) (Math.random() * 10) + 1;
    int input = 0;
    int count = 0;

    do {
      input = sc.nextInt();
      count++;
      if (input > answer) {
        System.out.println("작성한 숫자보다 정답은 작습니다.");
      } else if (input < answer) {
        System.out.println("작성한 숫자보다 정답은 큽니다.");
      } else {
        System.out.println("정답입니다.");
      }
    } while (input != answer);
  }

  /**
   * 사용자로부터 숫자 하나를 입력받아 그 수의 구구단을 1부터 9까지 출력
   */
  public void method7() {
    System.out.println("정수 입력:");
    int input = sc.nextInt(); //문자입력시 에러
    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %2d \n", input, i, i * input);
    }
    System.out.println();
  }

  /**
   * 비밀번호:"java1234" 올바른 비밀번호를 입력할 때까지 입력 입력횟수 5회 초과시 "접속 차단합니다" 메세지 출력후 종료
   */
  public void method8() {
    String checkPassword = "java1234";
    String input = "";
    int attempt = 0;
    do {
      System.out.printf("시도횟수(%d/5) 비밀번호를 입력하세요\n", attempt);
      input = sc.nextLine();
      if (input.equals(checkPassword)) {
        System.out.println("접속 완료");
        break;
      } else {
        System.out.println("비밀번호 미일치");
      }
      if (attempt > 5) {
        System.out.println("접속 차단합니다.");
        break;
      }
      attempt++;
    }
    while (true);

  }


}
