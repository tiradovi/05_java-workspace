package edu.polymorphism.ex2.service;

import edu.polymorphism.ex2.model.Professor;
import edu.polymorphism.ex2.model.Student;
import edu.polymorphism.ex2.model.UniverseMember;

/**
 * 대학교 기능 서비스
 */
public class UniverseService {
    // 1. 교수님 정보 입력할 수 있는 객체 생성
    Professor prof1 = new Professor("홍길동", "PROF007", "컴퓨터공학과");
    // 2. 학생 정보 입력할 수 있는 객체 생성
    Student student1 = new Student("이순신", "20230001", "컴퓨터공학과", 2, 4.3);

    // 다형성으로 정보 출력
    UniverseMember[] ums = {prof1, student1}; //우리학교 멤버들에는 교수님1명 학생1명 존재

    //     = 활용해서 변수이름에 데이터를 넣지 않는 이상 거의다 method 내부에 작성해야함

    public void info() {
        for (UniverseMember member : ums) {
            member.toString(); //System 으로 작성된 것이 아니기 때문에
            // 변수이름에 저장되어 있는 데이터를 확인하기 위해서는 현재 html 문서랑 연결해놓은 상태가 아니므로
            // System 출력문을 통해 데이터의 값을 확인할 수 있다.

            System.out.println(member.toString());
        }
    }

}