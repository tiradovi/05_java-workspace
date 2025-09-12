package edu.practice.day14;

import java.util.Scanner;

public class Day14Run {
    public static void main(String[] args) {
        System.out.println("=== Java 파일 처리 기초 실습 Day 14 ===\n");

        Day14Practice practice = new Day14Practice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("실행할 문제를 선택하세요:");
            System.out.println("1. 메모 저장하기");
            System.out.println("2. 일기 쓰기");
            System.out.println("3. 방문자 기록");
            System.out.println("4. 설정 파일 생성");
            System.out.println("5. 모든 문제 실행");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.println("\n--- 문제 1: 메모 저장하기 ---");
                    practice.saveMemo();
                    break;
                case 2:
                    System.out.println("\n--- 문제 2: 일기 쓰기 ---");
                    practice.writeDiary();
                    break;
                case 3:
                    System.out.println("\n--- 문제 3: 방문자 기록 ---");
                    practice.recordVisitor();
                    break;
                case 4:
                    System.out.println("\n--- 문제 4: 설정 파일 생성 ---");
                    practice.createConfig();
                    break;
                case 5:
                    System.out.println("\n--- 모든 문제 실행 ---");
                    practice.saveMemo();
                    System.out.println();
                    practice.writeDiary();
                    System.out.println();
                    practice.recordVisitor();
                    System.out.println();
                    practice.createConfig();
                    break;
                case 0:
                    System.out.println("실습을 마치겠습니다. 수고하셨습니다!");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }

            System.out.println("\n" + "=".repeat(50) + "\n");
        }
    }
}
