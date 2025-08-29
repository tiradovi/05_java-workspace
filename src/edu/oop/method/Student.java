package edu.oop.method;

public class Student {
    // 속성 필드 변수들

    public static String schoolName = "더조은대학교";

    public static final int MIN_VALUE = 0; // 스킬 역량 최소
    public static final int MAX_VALUE = 100; // 스킬 역량 최대

    private String name;
    private String studentNumber;
    private char gender;
    private int java;
    private int html;

    // 메서드
    // 메서드(기능) VS 변수(데이터를 담고 있는 공간의 명칭) -> 이름 명칭 뒤에 ()가 붙느냐 붙지 않느냐

    // 생성자(기본)

    public Student() {
        //추가적으로 동작해야하는 행동 작성
    }

    // 생성자(필수)
    public Student(String name, String studentNumber, char gender) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setHtml(int html) {
        this.html = html;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public char getGender() {
        return gender;
    }

    public int getJava() {
        return java;
    }

    public int getHtml() {
        return html;
    }
}
