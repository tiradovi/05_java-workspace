package edu.variable;

public class VariableEx3 {

  public static void main(String[] args) {
    /*
     *** 강제 형변환 ***
     1. 값의 범위가 큰 자료형은 작은 자료형으로 강제로 변환 -> 데이터 손실 고려
     2. 의도적으로 자료형을 다른 자료형으로 변환 시킬 때

     [작성법]
     (자료형) 변수이름 || 값; // 지정된 자료형으로 변경됨

     */

    // 강제 형변환 확인1
    // -> 자료형 변환 + 데이터 손실
    int num1 = 290;
    // byte -128 ~ 127
    byte result1 = (byte) num1;// 강제 형변환
    System.out.println(num1);
    System.out.println(result1);

    // 강제 형변환 확인2
    // -> 실수를 정수로 변환하여 소수점 없애기
    // (데이터 손실 활용)
    double num2 = 123.123456789;
    int result2 = (int) num2;
    System.out.println(result2);

    // 난수 + 강제 형변환
    // 난수 : Math.random();
    // -> 0.0 <= x < 1.0
    // 1 ~ 10 사이의 난수
    int random = (int) (Math.random() * 10 + 1);
    System.out.println(random);

    // 강제 형변환 확인 3
    // 문자(char) <-> 유니코드(int)
    System.out.println("===컴퓨터 상에서 각 문자의 숫자 번호===");
    System.out.println("A의 번호 :" + (int) 'A');
    System.out.println("a의 번호 :" + (int) 'a');
    System.out.println("가의 번호 :" + (int) '가');
    System.out.println("84의 문자 :" + (char) 84);

      /* === 출력 구문 ===
        ===컴퓨터 상에서 각 문자의 숫자 번호===
        A의 번호 :65
        a의 번호 :97
        가의 번호 :44032
        84의 문자 :T
      */

    /* ASCII 코드 값
     ********* ASCII :   ***************
     * 1~31 : 제어문자 출력 X
     * 32 : 스페이스 (공백)
     * 33~64 : 특수문자 및 숫자 일부
     */

  }
}
