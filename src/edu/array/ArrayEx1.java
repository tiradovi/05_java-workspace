package edu.array;

import java.util.Scanner;

/**
 * 배열 기능용 클래스
 */
public class ArrayEx1 {

  Scanner sc = new Scanner(System.in);
  /* 배열 (자료구조)
    - Java에서의 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
    - 생성된 배열의 요소는 index를 이용해서 구분
    - 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"이용

    [참조형 변수]
    - 주소를 저장하는 변수
    - 변수 사용시 저장된 주소로 찾아가서 그곳에 위치한 배열, 객체를 참조한다.
    - 기본 자료형 8개(bool,byte,short,int,long,char,float,double)를 제외한 나머지는 모두 참조형 변수
    - 즉 참조형 변수는 개발자가 만들어 놓은 클래스 파일을 참조하는 변수 이름
  */

  /**
   * 배열 선언, 할당, 초기화
   */
  public void method1() {
    //변수 선언
    int num;
    // Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고 그 변수의 이름을 "num"으로 지정

    //배열 선언
    int[] arr;
    // Stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장) 그 변수의 이름을 "arr"로 지정 

    //배열 할당
    arr = new int[4];
    // Heap 영역에 int 4개짜리 배열을 할당한 후 생성된 배열의 주소를 "arr" 변수에 대입

    // -> arr을 이용해서 배열을 참조해서 arr에 저장된 데이터를 사용 가능
    
    /*
    bug : 프로그램 수행중 발생하는 오류(==error)
    debug: 프로그램 수행중 특정 시점에 어떤 값을 지니고 있는지 확인하는 것 -> 오류분석
     */

    //배열 초기화
    // 1) 초기화 전 확인
    System.out.println("초기화 전 배열의 상태");
    System.out.println("arr의 주소명칭: " + arr);
    System.out.println("arr의 초기값 길이: " + arr.length);
    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
    System.out.println();
    // 2) 인덱스를 이용한 초기화
    arr[0] = 100;
    arr[1] = 10000;
    arr[2] = 3;
    arr[3] = 777;
    /*
    arr[4] = 5555; 길이 초과
    자바에서는 고정 길이
    자바스크립트는 동적 길이
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    at edu.array.ArrayEx1.method1(ArrayEx1.java:52)
    at edu.array.ArrayRun.main(ArrayRun.java:10)
    
    추후 ArrayList로 칸수 관계 없는 배열을 개발자가 만들어 사용
    */
    System.out.println("초기화 후 배열의 상태");
    System.out.println("arr의 주소명칭:" + arr);
    System.out.println("arr의 값 길이: " + arr.length);
    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);


  }

  /**
   * 정수 4개 입력받아 배열에 차례대로 대입후 for문으로 배열 확인
   */
  public void method2() {
    int[] arr = new int[4];

    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + "번째 인덱스");
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
