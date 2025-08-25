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
  }
}
