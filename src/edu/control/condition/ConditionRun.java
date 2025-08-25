package edu.control.condition;

/**
 * 조건문 실행용 클래스 같은 폴더일 경우 import 필요 X 다른 폴더일 경우 import 필요 O
 */
public class ConditionRun {

  public static void main(String[] args) {
    ConditionEx ex = new ConditionEx();
    /*
     Function 이라면 method1() 형태로 단독 사용
     method 라면 객체.method1() 형태로 특정 클래스나 예약어에 존재하는 기능 사용 형태로 작성
     */
    //  ex.method1();
    //   ex.method2();
    ex.method3();
  }
}
