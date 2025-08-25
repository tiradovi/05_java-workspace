import java.util.Scanner;

public class ScannerEx1 {

  public static void main(String[] args) {

    /*
     * 외부 라이브러리 > 자바 버전 폴더 > java.base 내에 유틸 폴더 내 존재
     *
     * Scanner.next() : 단어(String) 1개 입력, 공백시 종료
     * Scanner.nextLine() : 문자열(String) 1개 입력, 엔터시 종료
     * Scanner.nextInt() : int형 1개 입력
     * Scanner.nextLine() : 문자열(String) 1개 입력, 엔터시 종료
     * Scanner.nextLine() : 문자열(String) 1개 입력, 엔터시 종료
     *
     */

    /*
     * Scanner 사용하기
     *
     * 1. 클래스 위에 import 구문 작성
     * 2. import한 Scanner 클래스를 이용해서 Scanner 객체 생성
     *
     * System.in : 인텔리제이 실행창이나 CLI창에서 입력
     */

    //System.out.println("num = ", num); 사용 불가 가능한 + 사용
    //System.out.printf(); "," 사용 가능
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 1 : ");
    int num1 = sc.nextInt();

    System.out.print("정수 입력 2 : ");
    int num2 = sc.nextInt();
    System.out.print("실수 입력 : ");
    float num3 = sc.nextFloat();

    System.out.print("단어 입력(2개) :");
    String word1 = sc.next();
    String word2 = sc.next();

    // *************************************
    // -next() / nextInt() / nextDouble() 등 작성 후
    // nextLine()을 작성해야할 때
    // nextLine()을 미리 한번 작성

    sc.nextLine();
    System.out.print("문장 입력 : ");
    String str1 = sc.nextLine();

    System.out.printf("%d,%d,%f,%s,%s,%s", num1, num2, num3, word1, word2, str1);
  }
}
