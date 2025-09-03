package edu.polymorphism.ex2.model;

public class Student extends UniverseMember {
    private String studentMajor;
    private int studentGrade; // 학년
    private double studentGpa; // 학점

    public Student() {
    }

    public Student(String name, String id) {
        super(name, id);
    }

    public Student(String studentMajor, int studentGrade, double studentGpa) {
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public Student(String name, String id, String studentMajor, int studentGrade, double studentGpa) {
        super(name, id);
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    @Override
    public String toString() {
        return super.toString() + "studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentGpa=" + studentGpa;
    }
}