/*  범위 주석
 *
 *  // 한 줄 주석
 *   주석 : 컴파일러가 해석되지 않는 구문
 *           -> 코드 설명 작성 시 사용
 * */
//     class : 자바 코드를 작성하는 영역
//              - 객체의 내용(속성, 기능)을 정의함
//              (JS의 생성자 함수와 비슷한 형태)
//     class 이름 = 파일 명칭과 동일하게 작성
public class Main {

  //                 main 메서드
  //  자바 프로그램을  실행 시키기 위해서 반드시 필요한 구문
  //  자바 프로그램 실행하기 위한 설정
  public static void main(String[] args) {
    // System.out.println();
    // -> () 안의 문자열을 console에 출력 후 줄바꿈하는 기능
    // print = 줄바꿈 없이 가로로 이어서 출력
    // println = 출력 후 줄바꿈을 진행

    System.out.println("Hello World");

    System.out.println("Java는 코드 끝에 반드시 세미콜론(;)을 붙여야 합니다.");

    System.out.println(100 + 200); // 숫자 연산 가능

    System.out.println(100 + 30 + "입니다."); // 숫자 연산 후 + 문자열과 이어쓰기 가능

    // 사칙 연산 우선순위 적용
    // 먼저 연산하고 싶으면 소괄호() 묶어준다.
    //              소괄호로 감싸져있는 100 + 30 우선 실행
    System.out.println("합계 : " + (100 + 30) + "원");

    /**
     * JAVA API DOC 확인 : 궁금한 것은 자바가 만들어서 제공하는 코드에 대한 설명 공식 문서 참고
     * 구글에서 java api doc 을 검색하면
     * oracle 에서 overview(자바 버전 작성)
     * 각자 컴퓨터에서 java -version 으로 확인된 버전의 오버뷰를 확인
     * https://docs.oracle.com/en/java/javase/21/docs/api/index.html
     *
     * cmd 명령 프롬포트 창에서 확인한 자바 버전 21 버전이므로 21 API 확인 요망
     */
  }
}