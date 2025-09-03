package edu.polymorphism.ex2.model;

// 모든 것을 하나의 클래스에 넣은 나쁜 예시
public class 나쁜학교AllInOne {
    // 학생 정보 관련 필드들
    private String studentName;
    private String studentId;
    private String studentMajor;
    private int studentGrade; // 학년
    private double studentGpa; // 학점

    // 교수 정보 관련 필드들
    private String professorName;
    private String professorId;
    private String professorDepartment;
    private String professorOfficeLocation;
    private double professorSalary;

    // 강의 정보 관련 필드들
    private String courseName;
    private String courseCode;
    private int courseCredits; // 학점
    private int currentEnrollment; // 현재 수강 인원
    private int maxEnrollment; // 최대 수강 인원

    // 도서관 도서 정보 관련 필드들
    private String bookTitle;
    private String bookAuthor;
    private String bookIsbn;
    private boolean isBookCheckedOut; // 대출 여부
    private String checkoutUser; // 대출한 사용자


    // 학생 관련 메서드들
    public void displayStudentInfo() {
        System.out.println("학생 이름: " + studentName);
        System.out.println("학번: " + studentId);
        System.out.println("전공: " + studentMajor);
    }

    public void promoteStudent() {
        this.studentGrade++;
        System.out.println(studentName + " 학생이 " + studentGrade + "학년으로 진급했습니다.");
    }

    // 교수 관련 메서드들
    public void displayProfessorInfo() {
        System.out.println("교수 이름: " + professorName);
        System.out.println("교번: " + professorId);
        System.out.println("소속 학과: " + professorDepartment);
    }

    // 강의 관련 메서드들
    public void openCourse() {
        System.out.println("강의 [" + courseName + "]가 개설되었습니다. (최대 " + maxEnrollment + "명)");
    }

    // 도서 관련 메서드들
    public void displayBookInfo() {
        System.out.println("도서 제목: " + bookTitle);
        System.out.println("저자: " + bookAuthor);
        System.out.println("대출 가능 여부: " + (isBookCheckedOut ? "불가" : "가능"));
    }

    // 여러 정보가 복합적으로 사용되는 메서드 (학생이 강의를 수강신청)
    public void enrollInCourse() {
        if (currentEnrollment < maxEnrollment) {
            currentEnrollment++;
            System.out.println(studentName + " 학생이 " + courseName + " 강의를 수강신청했습니다. (현재 수강인원: " + currentEnrollment + "명)");
        } else {
            System.out.println("수강 인원이 가득 찼습니다.");
        }
    }

    // 여러 정보가 복합적으로 사용되는 메서드 (학생이 책을 대출)
    public void checkOutBook() {
        if (!isBookCheckedOut) {
            this.isBookCheckedOut = true;
            this.checkoutUser = this.studentName;
            System.out.println(studentName + " 학생이 '" + bookTitle + "' 책을 대출했습니다.");
        } else {
            System.out.println("'" + bookTitle + "' 책은 이미 " + this.checkoutUser + "님이 대출 중입니다.");
        }
    }

    public void returnBook() {
        if (isBookCheckedOut) {
            this.isBookCheckedOut = false;
            System.out.println(this.checkoutUser + "님이 '" + bookTitle + "' 책을 반납했습니다.");
            this.checkoutUser = null;
        } else {
            System.out.println("해당 도서는 대출 상태가 아닙니다.");
        }
    }

    // 모든 정보를 한 번에 출력하는 메서드
    public void displayAllSchoolInfo() {
        System.out.println("======= 학교 시스템 정보 =======");
        System.out.println("\n--- 학생 정보 ---");
        displayStudentInfo();
        System.out.println("학년: " + studentGrade + ", 학점: " + studentGpa);

        System.out.println("\n--- 교수 정보 ---");
        displayProfessorInfo();

        System.out.println("\n--- 강의 정보 ---");
        System.out.println("강의명: " + courseName + ", 학수번호: " + courseCode);
        System.out.println("수강인원: " + currentEnrollment + "/" + maxEnrollment);

        System.out.println("\n--- 도서 정보 ---");
        displayBookInfo();
        System.out.println("==============================");
    }


}