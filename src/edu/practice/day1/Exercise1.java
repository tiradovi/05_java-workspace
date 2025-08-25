package edu.practice.day1;

public class Exercise1 {

  public static void main(String[] args) {
    String name = "김자바";
    int age = 25;
    double height = 175.5;
    char gender = 'M';
    String hobby = "프로그래밍";

    System.out.printf("=== 개인정보===\n");
    System.out.printf("이름 : %s \n", name);
    System.out.printf("나이 : %d \n", age);
    System.out.printf("키 : %.1f \n", height);
    System.out.printf("성별 : %c \n", gender);
    System.out.printf("취미 : %s \n", hobby);
  }
}
