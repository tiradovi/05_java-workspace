package edu.oop.method;

import java.util.Scanner;

/**
 * Student 속성을 활용한 기능 제공 클래스
 */
public class StudentService {
    private Scanner sc = new Scanner(System.in);

    /**
     * 메인 메뉴를 제공하는 화면
     */
    public void displayMenu() {
        int input;

        //학생 객체를 참조할 참조형 변수 2개 선언
        Student student1 = new Student("홍길동", "112233", '남');// 변수명도 가지고 값도 들어감
        Student student2 = null; // 이 친구도 static은 가진다. 다만 변수명은 못가짐
        // Student student3 = new Student(); // 변수명은 가짐

        while (true) {
            // Scanner = input textarea 대신 사용
            // System = div, p, span, a 등 대신 사용 ===> html과 java 연결후 html활용 예정
            // 그 후 Scanner 사용 X, System은 개발자가 데이터를 무사히 전달하고 사용하고 있는지 확인 용도
            System.out.println("""
                    === 학생 관리 프로그램 ===
                    1. 학생 등록
                    2. 학생 정보 확인
                    3. 학생 이름 수정
                    4. Java 공부하기
                    5. HTML 공부하기
                    6. Java 역량 비교하기
                    7. HTML 역량 비교하기
                    0. 프로그램 종료
                    """);
            // label 대신 사용
            System.out.print("메뉴 선택 : ");
            // input type = number 대신 사용
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("학생을 등록할 변수를 선택하세요.");
                    System.out.print("1=student1 / 2=student2 :");
                    int select = sc.nextInt();
                    if (select == 1) {
                        System.out.println("이미 학생이 등록되어 있는 번호입니다.");
                    } else {
                        System.out.println("학생 등록을 시작하겠습니다.");
                    }
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }
}
