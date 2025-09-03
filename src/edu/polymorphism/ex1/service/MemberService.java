package edu.polymorphism.ex1.service;

import edu.polymorphism.ex1.model.Member;

public class MemberService {

    Member member = new Member("김철수", "kim123", "kim@email.com",
            "010-1234-5678", "서울시 강남구", 30, "VIP", 1500.0);

    public void info() {
        // member.정보조회로 작성된 기능 활용
        // member.toString();
        // return으로 정보를 가지고 있는 상황
        System.out.println(member.toString()); //  html 이 없기 때문에출력문으로 데이터 조회
    }

}