package edu.practice.day13;

import java.util.Scanner;

public class ExerciseRun {
    public static void main(String[] args) {
        System.out.println("=== 고급 파일 처리 연습 Day 13 ===\n");

        Exercise2 ex2 = new Exercise2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("실행할 문제를 선택하세요:");
            System.out.println("1. 학생 정보 파일 생성");
            System.out.println("2. 텍스트 다운로드");
            System.out.println("3. 중복 파일명 처리");
            System.out.println("4. 파일 이동 및 복사");
            System.out.println("5. 로그 파일 생성기");
            System.out.println("6. 파일 정보 조회");
            System.out.println("7. 모든 문제 실행");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.println("\n--- 문제 1 실행 ---");
                    ex2.solution1();
                    break;
                case 2:
                    System.out.println("\n--- 문제 2 실행 ---");
                    ex2.solution2();
                    break;
                case 3:
                    System.out.println("\n--- 문제 3 실행 ---");
                    ex2.solution3();
                    break;
                case 4:
                    System.out.println("\n--- 문제 4 실행 ---");
                    ex2.solution4();
                    break;
                case 5:
                    System.out.println("\n--- 문제 5 실행 ---");
                    ex2.solution5();
                    break;
                case 6:
                    System.out.println("\n--- 문제 6 실행 ---");
                    ex2.solution6();
                    break;
                case 7:
                    System.out.println("\n--- 모든 문제 실행 ---");
                    ex2.solution1();
                    System.out.println();
                    ex2.solution2();
                    System.out.println();
                    ex2.solution3();
                    System.out.println();
                    ex2.solution4();
                    System.out.println();
                    ex2.solution5();
                    System.out.println();
                    ex2.solution6();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }

            System.out.println("\n" + "=".repeat(50) + "\n");
        }
    }
}
