package edu.oop.method;

public class StudentRun {
    public static void main(String[] args) {
//        StudentService studentService = new StudentService();
//        studentService.displayMenu();

        // 생성된 StudentService 객체를
        // 한번만 사용하는 경우
        new StudentService().displayMenu();
    }
}
