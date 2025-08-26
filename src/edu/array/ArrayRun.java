package edu.array;

/**
 * 배열 실행용 클래스
 */
public class ArrayRun {

  public static void main(String[] args) {
    // new 연산자 : HEAP 영역에 공간을 할당

    ArrayEx1 arrayEx1 = new ArrayEx1();
    arrayEx1.method1();
    arrayEx1.method2();

    ArrayEx2 arrayEx2 = new ArrayEx2();
    arrayEx2.method1();
    arrayEx2.method2();

  }
}
