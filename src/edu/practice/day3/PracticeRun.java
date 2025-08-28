package edu.practice.day3;

public class PracticeRun {

    public static void main(String[] args) {
        Practice1 p1 = new Practice1("Java 프로그래밍", "김개발", 25000);
        Practice2 p2 = new Practice2("Galaxy S24", 100);
        Practice3 p31 = new Practice3("홍길동", "123-456-789", 100000, "1234");
        Practice3 p32 = new Practice3("김철수", "321-654-987", 0, "5678");
        Practice4 p4 = new Practice4();
        Practice5 p5 = new Practice5("현대", "아반떼");

/*
        System.out.println("=== 문제 1: 도서 관리 클래스 ===");
        p1.displayInfo();
        p1.borrowBook();
        p1.displayInfo();
        p1.returnBook();

        System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");
        p2.powerOn();
        p2.displayPhone();
        p2.useBattery(30);
        p2.displayPhone();
        p2.chargeBattery(30);
        p2.displayPhone();

        System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");
        p31.displayAccount();
        p31.deposit(50000);
        p32.deposit(30000);
        p31.transfer("1234", p32, 20000);
        p31.checkTransactionCount();

        System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
        p4.setName("홍길동");
        p4.setStudentId(20241004);
        p4.inputScores();
        p4.printReport();
*/

        System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");
        p5.displayCarInfo();
        p5.startEngine();
        p5.accelerate(50);
        p5.drive(100);
        p5.displayCarInfo();
    }
}

