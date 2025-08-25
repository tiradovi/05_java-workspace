package edu.practice.day1;

import java.util.Scanner;

public class Exercise4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("국어 점수 : ");
    int korean = sc.nextInt();
    System.out.printf("영어 점수 : ");
    int english = sc.nextInt();
    System.out.printf("수학 점수 : ");
    int math = sc.nextInt();
    char grade;
    double average = (korean + english + math) / 3.0;

    if (average >= 90) {
      grade = 'A';
    } else if (average >= 80) {
      grade = 'B';
    } else if (average >= 70) {
      grade = 'C';
    } else if (average >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println();
    System.out.printf("평균: %.2f점 \n", average);
    System.out.printf("학점: %c", grade);

  }
}
