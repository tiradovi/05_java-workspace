package edu.practice.day4;

public class Student {
    private String name;
    private String studentId;
    private int score;

    public Student() {
    }

    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

    public void displayInfo() {
        System.out.println("학생명: " + getName());
        System.out.println("학번: " + getStudentId());
        System.out.println("점수: " + getScore() + "점");
        System.out.println("결과: " + isPass());
        System.out.println();

    }

    public String isPass() {
        if (getScore() >= 60) {
            return "합격";
        } else {
            return "불합격";
        }
    }
}
