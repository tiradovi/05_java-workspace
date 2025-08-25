package edu.variable;

public class VariableEx2 {

  // 메인 메서드 (= 기능 행동) 프로그램 실행하는 구문
  public static void main(String[] args) {
   /*
   * 컴퓨터의 값 처리 원칙*
   - 같은 자료형 끼리 연산, 결과도 같은 자료형

   * 형변환 *
   - 다른 자료형 끼리 연산시 자료형을 맞게 변환

   * 자동 형변환 *
   - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 맞추어 변환

   */

    // 자동 형변환 확인 1
    int num1 = 9;
    long num2 = 10_000_000_000L;

    long result1 = num1 + num2;

    System.out.println(result1);

    /*
     * int result2 = num1 + num2;
     * 필요한 타입: int
     * 제공된 타입: long
     * 자동 형변환 되어 result2는 long 값을 지니지만
     * int 형 크기의 바구니에 long 크기를 넣으려 해서 오류 발생
     *
     * */

    // 자동 형변환 확인 2
    int num3 = 300;
    double num4 = 12.34;
    double result3 = num4 + num3;
    System.out.println(result3); // 312.34

    // 자동 형변환 확인 3
    long num5 = 20L;
    float num6 = 3.14f;
    double result4 = num5 + num6;
    System.out.println(result4);
    // (참고)
    // double, float는 실수를 근사치로 표현
    // 따라서 소수점 문제로 인하여 정확하지 않은 숫자 계산 전달, 따라서 은행이나 숫자에 민감한 프로젝트에서는 사용X

  }
}
