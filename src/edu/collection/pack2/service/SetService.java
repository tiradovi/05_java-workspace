package edu.collection.pack2.service;

import java.util.HashSet;
import java.util.Set;

public class SetService {
    // Set : 집합, 주머니
    // - 순서 유지 X, 인덱스 없음

    // - 중복데이터 저장 불가(같은 데이터가 들어오면 덮어쓰기 됨)
    // 띄어쓰기나 공백도 모두 데이터

    // set 객체 생성
    // 1. HashSet(대표) : 처리 속도가 빠른 Set
    // 2. LinkedHashset : 순서 유지 Set
    // 3. TreeSet       : 자동 정렬 Set

    public void method1() {
        Set set = new HashSet();

        set.add("카카오");
        set.add("네이버");
        set.add("라인");
        set.add("당근");

        //[카카오, 네이버, 당근, 라인] 순서 무시
        System.out.println(set);

        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의 민족");
        set.add(" 배달의민족");
        set.add("배 달의민족");
        set.add("배달 의민족");
        set.add("배달의민 족");
        System.out.println(set);
        System.out.println(set.size());

        set.add(null);
        // 데이터가 존재하지 않음
        // 1회만 들어감
    }
}
