package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {
    Scanner scanner = new Scanner(System.in);

    public void saveBooks() {
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();

        System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)");
        while (true) {
            System.out.print("제목: ");
            String title = scanner.nextLine();

            if (title.equals("완료")) {
                break;
            }

            System.out.print("저자: ");
            String author = scanner.nextLine();
            System.out.print("출판년도 ");
            String year = scanner.nextLine();

            String dataList = "제목: " + title + ", 저자: " + author + ", 출판년도: " + year;
            bookData.append(dataList);
        }

        try {
            Files.createDirectories(bookDir);
            Files.writeString(bookFile, bookData.toString());
            // while 내부에서는 내용 추가가 가능하지만 
            // saveBooks 다시 실행시 초기화 되어 데이터가 다시 저장됨
            System.out.println("도서 목록이 저장되었습니다: " + bookFile.getFileName());
            System.out.println("저장된 내용: " + Files.readString(bookFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void manageGrades() {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeDir = Path.of("grades");
        Path gradeFile = Path.of("grades", today + "_성적표.txt");
        StringBuilder gradeData = new StringBuilder();

        System.out.println("학생 성적을 입력하세요 (종료를 입력하면 저장됩니다)");
        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                break;
            }

            System.out.print("국어: ");
            int kor = scanner.nextInt();
            System.out.print("영어: ");
            int eng = scanner.nextInt();
            System.out.print("수학: ");
            int math = scanner.nextInt();
            scanner.nextLine();

            double average = (kor + eng + math) / 3;
            String dataList = "이름: " + name + "\n국어: " + kor + "\n영어: " + eng + "\n수학" + math + "평균 : " + average + "\n";
            gradeData.append(dataList);
        }

        try {
            Files.createDirectories(gradeDir);
            Files.writeString(gradeFile, gradeData);
            System.out.println("오늘 성적표가 작성되었습니다:" + gradeFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void recordAccount() {
        Path householdDir = Path.of("household");
        Path accountFile = Path.of("household", "account_book.txt");
        String timestamp = getCurrentTime();
        StringBuilder accountData = new StringBuilder();

        System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)");
        while (true) {
            System.out.print("항목: ");
            String item = scanner.nextLine();

            if (item.equals("끝")) {
                break;
            }

            System.out.print("금액: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수입/지출: ");
            String inOut = scanner.nextLine();
            String pm = inOut.equals("수입") ? "+" : "-";

            String dataList = timestamp + " - " + item + ": " + pm + price + "(" + inOut + ")\n";
            accountData.append(dataList);
        }

        try {
            Files.createDirectories(householdDir);
            Files.writeString(accountFile, accountData, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("가계부 기록이 추가되었습니다.");
            System.out.println("=== 전체 가계부 기록 ===");
            System.out.println(Files.readString(accountFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void registerCustomer() {
        Path customerDir = Path.of("customers");
        Path customerFile = Path.of("customers", "customer_list.txt");
        StringBuilder customerData = new StringBuilder();

        System.out.println("고객 정보를 입력하세요 (exit을 입력하면 저장됩니다)");
        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.print("전화번호: ");
            String number = scanner.nextLine();
            System.out.print("이메일: ");
            String email = scanner.nextLine();
            System.out.print("주소: ");
            String address = scanner.nextLine();


            String dataList = "이름: " + name + "전화번호: " + number + "이메일: " + email + "주소: " + address + "\n";
            customerData.append(dataList);
        }
        try {
            Files.createDirectories(customerDir);

            if (!Files.exists(customerFile)) {
                Files.writeString(customerFile, customerData, StandardOpenOption.CREATE);
                System.out.println("새로운 고객 명단을 생성합니다.");
            } else {
                Files.writeString(customerFile, customerData, StandardOpenOption.APPEND);
                System.out.println("기존 고객 명단을 업데이트합니다.");
            }
            System.out.println("고객 명단이 저장되었습니다: " + customerFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processOrder() {
        Path orderDir = Path.of("orders");
        Path orderFile = Path.of("orders", "order_history.txt");
        StringBuilder orderData = new StringBuilder();
        String timestamp = getCurrentTime();
        int totalAmount = 0;
        try {
            Files.createDirectories(orderDir);
            System.out.println(orderDir + "폴더 생성완료\n");

            System.out.println("메뉴 주문을 입력하세요 (주문완료를 입력하면 저장됩니다)");
            orderData.append("=== 주문 내역서 ===\n " + "주문시간: " + timestamp);
            while (true) {
                System.out.print("메뉴명: ");
                String menu = scanner.nextLine();

                if (menu.equals("주문완료")) {
                    break;
                }

                System.out.print("수량: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                System.out.print("가격: ");
                int price = scanner.nextInt();
                scanner.nextLine();

                int amountPrice = (price * amount);
                totalAmount += amountPrice;
                String dataList = ", 메뉴: " + menu + ", 수량: " + amount + ", 단가: " + price + ", 총액: " + amountPrice + "원\n";
                orderData.append(dataList);
            }
            orderData.append("전체주문금액: " + totalAmount);


            Files.writeString(orderFile, orderData);
            System.out.println("주문 내역이 저장되었습니다: " + orderFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
