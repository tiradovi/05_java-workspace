package edu.collection.pack1.service;

import edu.collection.pack1.model.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListService {
    // List : 자료를 순차적으로 나열한 자료 구조
    // - 인덱스가 존재, 중복데이터 저장 가능
    // 인덱스: 0번 부터 순차적으로 변수 명칭이나 데이터들에 자리번호를 생성하는 것
    // for문의 i를 인덱스의 약자

    /**
     * List 사용해보기
     */
    public void method1() {
        // List 객체 생성
        // - List 인터페이스 : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정
        // -> 인터페이스이기에 객체 생성불가, 다형성 이용
        // ArrayList = List 후손 클래스

        List list = new ArrayList(); // 동적크기

        // 1. .add(E e) 목록에서 마지막에 e에 해당하는 데이터 추가
        list.add(1);
        list.add("아무거나 작성");


        System.out.println("list : " + list);
        // 2. E get(int index) : List에서 index 번째 요소 반환 받기

        // 3. int size() : List에 저장된 객체의 개수 반환
        System.out.println("list 저장된 데이터 개수 " + list.size());

    }

    /**
     * 컬렉션 List + 제너릭(타입 제한)
     * ArrayList 형태인데, 목록에 들어올 수 있는 자료형을 개발자가 제한한 목록 리스트
     */
    public void method2() {
        // String 데이터만 무제한으로 담고 무제한으로 목록을 제거할 수 있는 리스트
        // String 형태만 담을 수 있도록 설정
        // <> : String 형태만 담도록 설정
        List<String> stringList = new ArrayList<String>();

        stringList.add("닭갈비");
        stringList.add("치킨");
        stringList.add("보쌈");

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.get(2));
        // System.out.println(stringList.get(3));
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        // 데이터가 3개만 있으므로 문제 발생

        System.out.println("=".repeat(20) + "for문 활용하여 출력" + "=".repeat(20));
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        // 3. void add(int index, E e) : index 번째에 중간에 삽입 가능
        stringList.add(1, "막국수");

        // 4. String toString() : List 인터페이스를 만들면서 toString 을 추가로 작성하는 것이 번거로움
        System.out.println(stringList);
        // 5. E set(int index, E e) : index 번째 요소를 e로 수정-> 수정전 요소 반환후 수정
        String 수정전str = stringList.set(2, "양념치킨");
        System.out.println("수정 전 str" + 수정전str);
        System.out.println("수정 후 str" + stringList.get(2));
        System.out.println(stringList);

        // 6. int indexOf(E e) : List 내부에 e와 같은 요소가 있으면 인덱스반환 없으면 -1 반환
        System.out.println(stringList.indexOf("보쌈"));
        System.out.println(stringList.indexOf("막국수"));
        System.out.println(stringList.indexOf("콩국수"));

        // 7. boolean contains(E e):
        // List 내부에 e와 같은 요소가 있으면 true 없으면 false
        System.out.println(stringList.contains("막국수"));
        System.out.println(stringList.contains("콩국수"));

        // 8. E remove(int index)
        // index 번째 요소를 제거
        // -> 제거된 요소가 반환됨
        String target = stringList.remove(0);
        System.out.println(target);
        System.out.println(stringList);
    }

    /*
    List : 목록에 관한 컬렉션
    ArrayList : 배열 형태 리스트
    장점: 검색 빠름
    단점: 중간삽입,제거 느림
    예시 : 학생 성적 관리(조회가 많은 경우)
           게시판 목록(순서대로 보기)
           설정 값 저장(가끔 수정)
           대부분의 일반적 상황     
    
    LinkedList : 서로 연결된 링크 형태의 리스트 (기차)
    장점: 중간 삽입, 제거 빠름
    단점: 검색 느림
    예시 : 음악 플레이리스트 (중간에 곡 삽입/ 삭제)
           실행 취소 기능 (앞 뒤로 이동)
           대기열 관리 (앞에서 빼고 뒤에서 넣기)
     */
    public void method3() {
        //while 이용해서 도서 추가, 전체 조회, 종료

        //   List<Book> bookList = new ArrayList<Book>();
        List<Book> bookList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (true) {
            System.out.println("""
                    😀도서관리시스템😀
                    1️⃣ 추가
                    2️⃣ 전체 조회
                    0️⃣ 종료
                    """);
            System.out.println("메뉴 번호 입력 ➡️");
            input = sc.nextInt();
            sc.nextLine(); // 개행문자 제거

            switch (input) {
                case 0:
                    System.out.println("도서 프로그램 종료");
                    return;
                case 1:
                    System.out.println("도서 추가");
                    System.out.print("제목을 입력하세요: ");
                    String title = sc.nextLine();
                    System.out.print("저자를 입력하세요: ");
                    String writer = sc.nextLine();
                    System.out.print("가격을 입력하세요: ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    // int String boolean 이외 모든것을 담을 수 있음
                    // List<Book> -> 담을수 있는 데이터를
                    // Book class 책 문서 형태의 데이터들로 이루어진 것만 담도록
                    // 추가 제약
                    bookList.add(new Book(title, writer, price));
                    break;
                case 2:
                    if (bookList.size() > 0) {
                        System.out.println("전체 도서 목록 조회");
                        // bookList 공간에 저장된 책 조회하기
                        for (Book book : bookList) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("도서 미존재");
                    }

                    break;
                default:
                    System.out.println("잘못 입력");
            }
        }

    }
}
