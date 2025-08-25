import java.util.Scanner;

public class ScannerEx1 {

  public static void main(String[] args) {
    /**
     * Scanner 클래스
     *
     * - 사용자로부터 입력을 받기 위해 Java에서 제공하는 클래스
     *
     * - java.util 패키지에 존재
     *  -> import 구문 작성 필요
     *  -> java.util 내부 폴더 안에 만들어진 Scanner class를 호출하여 사용 가능
     *
     *  외부 라이브러리 > 자바 버전 폴더 > java.base 내에 유틸 폴더 내 존재
     *
     *  Scanner.next()      : 단어(String) 1개 입력
     *                                      공백 문자       입력 시 입력 종료
     *  Scanner.nextLine() : 문자열(String) 1개 입력
     *                                      엔터(개행 문자) 입력 시 입력 종료
     *  Scanner.nextInt()   : int형 정수 1개 입력
     *  Scanner.nextLong()  : long형 정수 1개 입력
     *  Scanner.nextDouble(): 실수 1개 입력
     *
     */

    // Scanner 사용하기

    // 1. 클래스 위에 import 하는 구문 작성

    // 2. import한 Scanner 클래스를 이용해서 Scanner 객체 생성

    // * System.in : 인텔리제이 실행창이나 CLI(cmd = 명령 프롬포트) 창에서 키보드로 입력

    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 1 : ");
    int num1 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num1에 넣어주기

    System.out.print("정수 입력 2 : ");
    int num2 = sc.nextInt();

    System.out.print("실수 입력 : ");
    double num3 = sc.nextDouble();

    System.out.print("단어 입력(2개) : "); // 사과 바나나 엔터
    String word1 = sc.next();
    String word2 = sc.next(); // 공백의 엔터가 남아있어 다음 문장 입력에 공백 입력됨
    // 공백 처리를 위해 sc.nextLine(); 을 사용해서 공백 담아내는 기능 설정

    // ********************************
    // - next() / nextInt() / nextDouble() 등을 작성한 이 후에
    // nextLine()을 작성해야하는 상황이 오면
    // nextLine()을 미리 한 번 작성하기

    sc.nextLine();
    /*
     * 자바스크립트에서는 변수 내부에 문자열, 숫자, 불리언 값의 구분이 존재하지 않음
     * 자바에서는 각 변수마다 메모리 할당량을 측정하기 위해서
     * 변수이름 내부에 넣어줄 값의 종류가 무엇인지를 결정해주고,
     * 종류에 해당하는 값만 작성을 해야함
     *
     * 그렇지 않으면 Mismatch 와 같은 Exception 예외 상황이 발생했다는 알림이 발생
     * */

    System.out.print("문장 입력 : ");
    String str1 = sc.nextLine();
    // 컴퓨터에서 num 이라는 변수이름 내에는 사용자가 작성한 숫자값이 들어있음

    // 자바에서는 print 로 시작하는 명칭 내에는 + 를 이용해서 출력 구문 작성
    //          printf만 예외적으로 , 를 사용할 수 있음!!!!!!
    // System.out.println("num 에 들어있는 숫자 : " , num);
    System.out.println("num 에 들어있는 숫자 : " + num1);

    //              num1,num2,num3  word1,word2,str1
    System.out.printf("%d, %d, %f,  %s,    %s,   %s", num1, num2, num3, word1, word2, str1);
  }
}