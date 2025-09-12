package edu.io.pack8.ex;

import java.util.Scanner;

public class StringBuilderRun {
    public static void main(String[] args) {

        StringBuilderService service = new StringBuilderService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("실행할 문제를 선택하세요:");
            System.out.println("1. 도서 정보 저장하기");
            System.out.println("2. 학생 성적 관리");
            System.out.println("3. 가계부 기록");
            System.out.println("4. 고객 정보 등록");
            System.out.println("5. 메뉴 주문 시스템");
            System.out.println("6. 모든 문제 실행");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.println("\n--- 문제 1: 도서 정보 저장하기 ---");
                    service.saveBooks();
                    break;
                case 2:
                    System.out.println("\n--- 문제 2: 학생 성적 관리 ---");
                    service.manageGrades();
                    break;
                case 3:
                    System.out.println("\n--- 문제 3: 가계부 기록 ---");
                    service.recordAccount();
                    break;
                case 4:
                    System.out.println("\n--- 문제 4: 고객 정보 등록 ---");
                    service.registerCustomer();
                    break;
                case 5:
                    System.out.println("\n--- 문제 5: 메뉴 주문 시스템 ---");
                    service.processOrder();
                    break;
                case 6:
                    System.out.println("\n--- 모든 문제 실행 ---");
                    service.saveBooks();
                    System.out.println();
                    service.manageGrades();
                    System.out.println();
                    service.recordAccount();
                    System.out.println();
                    service.registerCustomer();
                    System.out.println();
                    service.processOrder();
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
