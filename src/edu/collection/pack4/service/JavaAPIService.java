package edu.collection.pack4.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {
    /*
    Wrapper Class
    - wrap : 감싸다, 포장하다
    - 기본 자료형을 객체(속성, 기능)로 감싸는 클래스
        -> 기본 자료형의 객체화

        -> 왜냐하면 컬렉션처럼 객체만 취급하는 상황에서 기본 자료형도 취급 가능한 형태로 바꾸기
        위해 사용

        자바는 모든 것이 객체다라는 철학을 추구
        메모리적인 성능상의 이유로 기본타입을 별도로 유지

        기본 타입: int, short, byte, long, boolean, float
     */
    public void method1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(1000);
        list.add(-1);
        System.out.println(list);
        //결과는 모든 배열 값

        System.out.println(list.get(0) + list.get(1) + list.get(2));
        // 결과는 1101이라는 산수 결과
    }

    /**
     * 사용자가 String 객체 생성가능
     */
    public void method2() {
        String str1 = new String();
        // 원래대로라면 위와 같은 형태가 많으나 많은 개발자가 String을 기본타입으로 사용
        // 따라서 생략가능하도록 설정

        // 리터럴 개발자가 직접적으로 작성한 형태
        String str2 = "안녕하세요";
        String str3 = "어서오세요";

        // 직접적으로 작성하지 않고 대입, 리터럴 X
        String str4 = str2;


    }
}
