package edu.practice.day12;

import java.util.Scanner;

public class ExerciseRun {
    public static void main(String[] args) {
        System.out.println("=== 파일처리 연습 Day 12 ===\n");
        Scanner sc = new Scanner(System.in);
        Exercise1 ex1 = new Exercise1();

        System.out.println("--- 문제 1 실행 ---");
        System.out.print("폴더 명칭 입력하세요 : ");
        String dirName = sc.nextLine();
        System.out.print("파일 명칭 입력하세요 : ");
        String fileName = sc.nextLine();
        ex1.solution1(dirName, fileName);

        System.out.println("\n--- 문제 2 실행 ---");
        ex1.solution2(dirName, fileName);

        System.out.println("\n--- 문제 3 실행 ---");
        ex1.solution3(dirName, fileName);

        System.out.println("\n--- 문제 4 실행 ---");
        ex1.solution4();

        System.out.println("\n--- 문제 5 실행 ---");
        System.out.print("상위폴더 명칭 입력하세요 : ");
        String 폴더1번 = sc.nextLine();
        System.out.print("중간폴더 명칭 입력하세요 : ");
        String 폴더2번 = sc.nextLine();
        System.out.print("마지막폴더 명칭 입력하세요 : ");
        String 폴더3번 = sc.nextLine();
        ex1.solution5(폴더1번, 폴더2번, 폴더3번);

        System.out.println("\n=== 모든 연습 완료! ===");
    }
}