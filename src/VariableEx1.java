public class VariableEx1 {

  public static void main(String[] args) {

    // 변수 : 메모리에 값을 저장하기 위한 공간의 명칭
    // 이 때, 저장되는 값이 변할 수 있기 때문에 변수

    // 자료형 (data Type)
    // - 변수 또는 값의 크기와 형식
    
    /* 자바 기본 자료형(Java Primitive Types) 
    
    [논리형]
    boolean(1byte) -true /false
    
    [정수형]
    byte  (1byte) 
    short (2byte)
    int   (4byte)  * 기본형 *
    long  (8byte)  - 숫자 뒤에 L 작성, 소문자 가능

    [실수형]
    float (4byte)  - 숫자 뒤에 f
    double(8byte)  * 기본형 *
    
    [문자형]
    char  (2byte)  - 문자 하나, 문자 양옆에 '' 사용
    String(4byte)  - 문자열, 문자 양옆에 "" 사용
      
     */
    // 변수 선언 : 메모리에 공간 할당

    boolean isTrue; // 메모리에 boolean 저장 공간을 1byte 할당하고
    // 공간의 명칭을 isTrue 라고 부르겠다 설정

    double number1; // 메모리에 double 저장 공간을 8byte 할당하고
    // 공간의 명칭을 number1 이라고 부르겠다 설정

    //값 대입 : 변수 이름에 특정 값을 집어 넣음 (이미 값이 존재하는 변수이름에 대입시 --> 덮어쓰기)

    isTrue = true; // null-> true로 덮어쓰기

    // sout + tab = System.out.println();
    // so + tab = System.out.printf("");

    System.out.println("isTrue: " + isTrue);
    isTrue = false;
    System.out.println("isTrue: " + isTrue);

    int number2 = 2100000000; // 21억 오류 X

    // long number3 = 2200000000; // int 22억 오류 O integer 숫자가 너무 큽니다.
    // 오류가 나는 이유는 리터럴 값이 기본적으로 int이기 때문
    // 따라서 byte, short, long의 경우 뒤에 자료형 명칭이 없다면 int 
    long number3 = 2200000000L; // int 22억 오류 X   Long으로 변환했기 때문

    /* 자바 기본 변수 선언 문법

      자료형 변수이름 = 리터럴;

      자료형(Data Type) : 변수가 저장할 데이터의 종류를 지정
      변수이름(Variable Name) : 데이터를 저장할 메모리 공간의 이름
      리터럴(Literal) : 실제 저장되는 값 자체

      리터럴과 값의 차이

      리터럴(Literal) : 코딩에서 직접적으로 작성된 고정된 값
      값 (Value)     : 변수나 표현식이 실제로 가지고 있는 데이터

      int a = 100;               // 리터럴이자 값
      int b = a + 50;            // 리터럴 아니고 값
      int c = method명칭();       // 리터럴 아니고 메서드 리턴값
      int d = Scanner.nextInt(); // 리터럴 아니고 사용자의 입력 값

      즉 직접적으로 값이 정직하게 작성되어있지 않은 모든 것은 리터럴 X
     */


    /*
    nt1,nt2 : 4byte 크기의 데이터를 담는 바구니
    lng1,lng2 : 8byte 크기의 데이터를 담는 바구니

    nt2에 2배가량의 long 데이터를 담으려 하기 때문에 바구니 크기에 비하여 데이터가 크다는 문제 발생
    값을 억지로 넣을 수는 있으나 값이 왜곡되어 변수 이름 바구니에 담김
    ==> 강제 형변환
        숫자나 문자 앞에 바구니 자료형 소괄호로 작성하면 형변환

    lng1의 경우 문제없음 그러나 리터럴에 L 작성시 자료형 타입에도 Long을 작성하는 문제 발생 long 으로 바꿔야 함
    */
    System.out.println("number2: " + number2);
    System.out.println("number3: " + number3);

    int nt1 = 100;
    int nt2 = (int) 10000000000L;

    long lng1 = 200;
    long lng2 = 200000000000L;

    System.out.println("nt1: " + nt1);
    System.out.println("nt2: " + nt2);
    System.out.println("lng1: " + lng1);
    System.out.println("lng2: " + lng2);
  }
}
