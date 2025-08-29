package edu.oop.method;

import java.util.Scanner;

/**
 * Student 속성을 활용한 기능 제공 클래스
 */
public class StudentService {
    private Scanner sc = new Scanner(System.in);

    /**
     * 메인 메뉴를 제공하는 화면 = html 대신 활용
     * displayMenu 를 html 화면으로 데이터를 보낸다고 생각
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
                        System.out.println("학생정보가 없어 학생 등록을 시작하겠습니다.");
                        student2 = createStudent();
                        // student2 = new Student(createName, createNumber, createGender) // return으로 가져올 아래 생성자 객체대신 기능명칭 작성
                    }
                    break;
                case 2:
                    System.out.println("학생 정보를 확인합니다.");
                    System.out.println("학생 정보를 확인할 번호를 선택하세요");
                    System.out.print("1=student1 / 2=student2 :");
                    select = sc.nextInt();
                    if (select == 1) {
//                        System.out.println("학생이름" + student1.getName());
//                        System.out.println("학생학번" + student1.getStudentNumber());
//                        System.out.println("학생성별" + student1.getGender());
                        System.out.println(studentInfo(student1));
                    } else {
                        System.out.println(studentInfo(student2));
                    }
                    break;
                case 3:
                    System.out.println("이름 수정");
                    System.out.print("1=student1 / 2=student2 :");
                    select = sc.nextInt();
                    if (select == 1) updateStudentName(student1);
                    else updateStudentName(student2);

                    break;
                case 4:
                    System.out.println("자바 역량 수정");
                    System.out.print("1=student1 / 2=student2 :");
                    select = sc.nextInt();
                    if (select == 1) updateJava(student1);
                    else updateJava(student2);

                    break;
                case 5:
                    System.out.println("html 역량 수정");
                    System.out.print("1=student1 / 2=student2 :");
                    select = sc.nextInt();
                    if (select == 1) updateHtml(student1);
                    else updateHtml(student2);

                    break;
                case 6:
                    System.out.println(compareJava(student1, student2));
                    break;
                case 7:
                    System.out.println(compareHtml(student1, student2));
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }


    private Student createStudent() {
        System.out.print("이름: ");
        String createName = sc.next();
        System.out.print("학번: ");
        String createNumber = sc.next();
        System.out.print("성별(남/여): ");
        char createGender = sc.next().charAt(0);
        // sc.next().charAt(0); sc.next()로 입력받은 문자열 중에서
        // 0번째 인덱스 문자를 createGender에 삽입
        return new Student(createName, createNumber, createGender);
    }

    /**
     * 매개 변수로 전달 받은 학생의 정보를 문자열로 만들어 반환
     *
     * @param student : std1 또는 std2같은 데이터가 들어올 자리
     * @return private void studentInform(Student student){
     * <p>
     * }
     */
    private String studentInfo(Student student) {
        // String.format("패턴" 변수)
        // - 패턴 모양의 문자열을 반환하는 String 메서드


        String studentInfo = String.format("학생이름: %s\n학생번호: %s\n학생성별: %c\n자바실력: %d\nHTML실력: %d\n", student.getName(), student.getStudentNumber(), student.getGender(), student.getJava(), student.getHtml());
        return studentInfo;
    }

    // 보통 수정, 삭제 작업은 void 형태

    /**
     *
     * @param student : student1,student2 (학생정보 가져옴)
     *                수정 완료후 studentInfo에서 수정된 내용이 조회됨
     *                수정 실패시 studentInfo에서 수정되기 전 내용 조회
     */
    private void updateStudentName(Student student) {
        System.out.println("수정할 이름");
        String newName = sc.next();

        //새이름 세팅
        student.setName(newName);
        System.out.println("이름 수정 완료");
    }

    /**
     * Java 역량이 얼마나 증가 감소했는지 정수로 입력
     * 학생의 Java 역량을 관리자가 수정
     * 수정된 역량은 최대 최소를 넘지 못해야함
     *
     * @param student
     */
    private void updateJava(Student student) {
        System.out.println("증가 또는 감소한 Java의 역량 입력:");
        int newJava = sc.nextInt();
        int beforeJava = student.getJava();
        int result = beforeJava + newJava;

        while (result > Student.MAX_VALUE || result < Student.MIN_VALUE) {
            System.out.println("최대 점수는 100점입니다. 최소 점수는 0점입니다");

            System.out.println("현재 점수 :" + student.getJava() + "/ 최종결과" + result);

            System.out.print("점수를 다시 입력하세요");
            newJava = sc.nextInt();
            result = beforeJava + newJava;
        }
        student.setJava(result);
    }

    /**
     * Html 역량이 얼마나 증가 감소했는지 정수로 입력
     * 학생의 Html 역량을 관리자가 수정
     * 수정된 역량은 최대 최소를 넘지 못해야함
     *
     * @param student
     */
    private void updateHtml(Student student) {
        System.out.println("증가 또는 감소한 Html의 역량 입력:");
        int newHtml = sc.nextInt();
        int beforeHtml = student.getHtml();
        int result = beforeHtml + newHtml;

        while (result > Student.MAX_VALUE || result < Student.MIN_VALUE) {
            System.out.println("최대 점수는 100점입니다. 최소 점수는 0점입니다");

            System.out.println("현재 점수 :" + student.getHtml() + "/ 최종결과" + result);

            System.out.print("점수를 다시 입력하세요");
            newHtml = sc.nextInt();
            result = beforeHtml + newHtml;
        }
        student.setHtml(result);
    }

    /**
     * 매개 변수로 두 Student 받고 Java 점수 비교
     *
     * @param student1
     * @param student2
     * @return 비교결과 문자열로 반환
     */
    private String compareJava(Student student1, Student student2) {
        if (student1 == null || student2 == null) return "등록된 학생의 정보 조회X";
        if (student1.getJava() == student2.getJava()) return "학생의 점수가 같습니다.";
        else if (student1.getJava() > student2.getJava()) return student1.getName() + "의 점수가 더 높습니다.";
        else return student2.getName() + "의 점수가 더 높습니다.";
    }

    /**
     * 매개 변수로 두 Student 받고 HTML 점수 비교
     *
     * @param student1
     * @param student2
     * @return 비교결과 문자열로 반환
     */
    private String compareHtml(Student student1, Student student2) {
        if (student1 == null || student2 == null) return "등록된 학생의 정보 조회X";
        if (student1.getHtml() == student2.getHtml()) return "학생의 점수가 같습니다.";
        else if (student1.getHtml() > student2.getHtml()) return student1.getName() + "의 점수가 더 높습니다.";
        else return student2.getName() + "의 점수가 더 높습니다.";
    }
}
