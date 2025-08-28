package edu.practice.day4;

public class PracticeRun {

    public static void main(String[] args) {

        // 문제 1 학생 정보 관리 시스템
        System.out.println("\n=== 문제 1: 학생 클래스 테스트 ===");
        Student student1 = new Student("김자바", "2024001", 85);
        Student student2 = new Student("박코딩", "2024002", 45);

        student1.displayInfo();
        student2.displayInfo();

        // 문제 2 도서 관리 시스템
        System.out.println("\n=== 문제 2: 도서 관리 테스트 ===");
        Book book = new Book("자바의 정석", "남궁성", "978-89-7914-726-9");

        System.out.println("도서명: " + book.getTitle());
        System.out.println("저자: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("상태: " + (book.isAvailable() ? "대출가능" : "대출불가"));
        System.out.println();

        System.out.println("김자바님이 '" + book.getTitle() + "' 대출 시도");
        System.out.println("결과: " + book.borrowBook() + "\n");

        System.out.println("박코딩님이 '" + book.getTitle() + "' 대출 시도");
        System.out.println("결과: " + book.borrowBook() + "\n");

        System.out.println("김자바님이 '" + book.getTitle() + "' 반납");
        System.out.println("결과: " + book.returnBook() + "\n");


        // 문제 3 카페 주문 관리 시스템
        System.out.println("\n=== 문제 3: 카페 주문 관리 테스트 ===");
/*
        CafeOrder order1 = new CafeOrder();
        order1.setCustomerName("김자바");
        order1.setMenuItem("아메리카노");
        order1.setPrice(4000);
        order1.placeOrder();
        order1.printReceipt();

        CafeOrder order2 = new CafeOrder();
        order2.setCustomerName("박코딩");
        order2.setMenuItem("카페라떼");
        order2.setPrice(4500);
        order2.placeOrder();
        order2.printReceipt();

        System.out.println("현재 총 주문수: " + CafeOrder.totalOrders + "건");
        System.out.println("현재 총 매출: " + String.format("%,d", CafeOrder.totalSales) + "원");

        //문제 5
        System.out.println("\n=== 문제 5: 게임 캐릭터 테스트 ===");

        GameCharacter warrior = new GameCharacter("전사왕");
        GameCharacter mage = new GameCharacter("마법사", 3, 150, 120, 500);

        System.out.println("총 생성된 캐릭터 수: " + GameCharacter.totalCharacters + "명\n");

        warrior.showStatus();
        System.out.println();

        warrior.gainExp(800);
        warrior.gainExp(500);
        System.out.println();

        warrior.showStatus();
        System.out.println();

        warrior.attack();
        warrior.attack("스킬공격");
        warrior.attack("스킬공격");
        warrior.attack("스킬공격"); */
    }


}

