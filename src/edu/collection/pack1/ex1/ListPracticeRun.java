package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // 패키지 안나누고 실습
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
    }

    // void 앞에 static이 붙으면 변수이름에 의하여 호출되지않고
    // 단독으로 호출가능
    public static void problem1() {
        // 1. String 타입의 ArrayList를 생성하세요
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        // 3. 리스트의 크기를 출력하세요
        // 4. 모든 취미를 출력하세요 (반복문 사용)
        List<String> list = new ArrayList<String>();
        list.add("게임");
        list.add("독서");
        list.add("요리");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void problem2() {
        // 1. Integer 타입의 ArrayList를 생성하세요
        // 2. 시험 점수 5개를 추가하세요 (85, 90, 78, 92, 88)
        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        // 4. 수정 후 모든 점수를 출력하세요
        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요
        List<Integer> list = new ArrayList<>();
        list.add(85);
        list.add(90);
        list.add(78);
        list.add(92);
        list.add(88);
        list.set(2, 95);
        System.out.println(list);
        System.out.println(list.remove(0));
    }

    public static void problem3() {
        // 1. 음식 메뉴 리스트를 만들고 다음 메뉴를 추가하세요
        //    "김치찌개", "된장찌개", "불고기", "비빔밥", "냉면"
        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력하세요
        // 3. "라면"이 메뉴에 있는지 확인하세요 (true/false 출력)
        // 4. "김치찌개"가 메뉴에 있는지 확인하세요
        // 5. 마지막 메뉴("냉면")를 제거하고 결과를 출력하세요
        List list = new ArrayList();
        list.add("김치찌개");
        list.add("된장찌개");
        list.add("불고기");
        list.add("비빔밥");
        list.add("냉면");
        System.out.println(list.indexOf("불고기"));
        System.out.println(list.contains("라면"));
        System.out.println(list.contains("김치찌개"));
        list.remove(list.indexOf("냉면"));
        System.out.println(list);

    }

    public static void problem4() {
        // 1. 쇼핑 카트 리스트를 만드세요
        // 2. "사과", "바나나", "우유" 를 추가하세요
        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요
        List list = new ArrayList();
        list.add("사과");
        list.add("바나나");
        list.add("우유");
        System.out.println(list.size());
        list.set(1, "오렌지");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("상품: " + list.get(i));
        }
    }

    public static void problem5() {
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        // 3. 5보다 큰 숫자의 개수를 세어보세요
        // 4. 가장 큰 숫자를 찾아서 출력하세요
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        int count = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
            if (list.get(i) > 5) {
                count++;
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println();
        System.out.println("5 보다 큰 수의 개수 : " + count);
        System.out.println("최대 값 : " + max);

    }


}
