package edu.control.loof;

import java.util.Scanner;

/**
 * 루프 기능 설정용 클래스 중첩 반복문
 */
public class LoopEx2 {

  // 스캐너 변수이름 전역변수로 작성
  Scanner sc = new Scanner(System.in);
  /*
    지역변수 전역변수 변수의 선언 위치에 따라 접근 범위가 달라지는 것을 의미

    멤버변수, 전역변수, 인스턴스 변수, 필드 (global variable)

    인스턴스 변수: 객체가 생성될 때 메모리에 올라감
    static 없이 선언, class 중괄호 바로 다음에 작성하는 변수 명칭
    
    클래스 변수: 프로그램 실행 시 한번만 생성되고, main내에 존재하지 않아도
    heap 아닌 static 내에서 존재
    static int 변수이름 데이터 값
   */

  /**
   * 2단부터 9단까지 모두출력
   */
  public void method1() {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d X %d = %2d\n", i, j, i * j);
      }
      System.out.println();
    }
  }

}
