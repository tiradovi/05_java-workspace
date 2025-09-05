package edu.collection.pack4.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {
    /* Wrapper Class
            - wrap : 감싸다, 포장하다

            - 기본 자료형을 객체(속성, 기능)로 감싸는 클래스
                -> 기본 자료형의 객체화

        -> 왜냐하면 컬렉션 처럼 객체만 취급하는 상황에서
                기본 자료형도 취급 가능한 형태로 바꾸기 위해 만들어짐

        자바는 "모든 것이 객체" 다 라는 철학을 추구!
        메모리적인 성능상의 이유로 기본 타입(primitive type)을 별도로 유지

        기본 타입 : int, short, byte, long, boolean, float, double, char
            -> 객체보다 메모리 적으로 차지하는 공간의 비중이 정해져 있는 타입들
                기본타입은 자바보다 먼저 있었던 타입들

        자바는 객체(Class 파일로 만들어진 문서) 중심으로 실행하는 프로그램이기 때문에
            기본 타입 또한 class 파일 형태로 자바 개발자들이  만들어 놓은 상태


            boolean   <--> Boolean
            byte      <--> Byte
            short     <--> Short
            int       <--> Integer
            long      <--> Long
            float     <--> Float
            double    <--> Double
            char      <--> Character
                           String    은 기본타입과 별개로 만들어진 문서
                                        --> char 라는 타입을 이용하여 문자를 하나씩 가져오는 것이
                                        -->  효율적이지 않다고 여기기 때문에 String 파일 생성 후
                                        -->  문자데이터를 한 번에 작성할 수 있게 설정

            ArrayList 처럼 class 파일 문서 형태만 유연한 배열 형태에
            특정 파일의 데이터만 들어올 수 있도록 제약을 걸어놓은 문서를 사용할 때

            Java 언어를 사용하면서 ArrayList 를 활용하고, 유연한 목록 배열 리스트에
            숫자나, 소수값이나 참/거짓 만 담을 수 있게 설정하고자 하는 개발자들을 위하여
            기본 타입에서 앞 글자만 대문자로 변경한 Wrapper 클래스 타입을 제공


            List<> a = new ArrayList<>();

            의 경우에는 a 라는 공간에  숫자, 문자, 참/거짓, 소수값 모두 담을 수 있는 종합 바구니

            d 바구니는 숫자만 담을 수 있는 공간으로 설정하고 싶음!

            List<클래스 파일로 이루어진 문서들만 제한 가능> b = new ArrayList<>();

            List<int> c = new ArrayList<>();

            int 는 클래스 파일로 이루어진 타입이 아니기 때문에 문제가 발생
             List<Integer> d = new ArrayList<>();

     */


    // run 폴더를 생성 후 WrapperRun 만들김
    // main 에서 method1 실행

    // method1 숫자 타입으로 이루어진 기능
    // 숫자는 1 100 1000 -1 을 추가한 후 모두 출력


    public void method1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(1000);
        list.add(-1);

        System.out.println(list);  //toString 을 생략한 것

        // get 과 index 번호를 활용하여 출력
        // 숫자끼리 자동으로 셈을 진행하여 1101 이라는 셈 결과가 출력
        System.out.println(list.get(0) + list.get(1) + list.get(2));
    }

    /**
     * 사용자(개발자)가 관리하는 String 객체 생성해서 사용할 수 있다.
     */
    public void method2() {
        String str1 = new String();
        // 원래대로라면 스트링 또한 new String() 형태로 데이터가 들어갈 수 있는 공간을 생성하는 것이 맞음
        // 수많은 개발자가 String 자체를 기본타입 이상으로 사용하기 때문에
        // new String() 을 생략 후 int 나 double 처럼 리터럴 형태로 특정 공간에
        // 데이터를 작성할 수 있도록 설정

        // 리터럴 = 데이터를 개발자가 직접적으로 작성한 형태
        String str2 = "안녕하세요";
        String str3 = "어서오세요";

        // str2   str3 는 리터럴 형태로 각각의 공간에 데이터를 추가

        String str4 = str2; // 처럼 "안녕하세요" 를 직접적으로 작성하지 않고
        // str2 를 대입한 것은 리터럴 형태가 아님
        // str2 를 이용하여 값을 넣어준 것
    }
}