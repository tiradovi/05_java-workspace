package edu.practice.day11;

import practice.exception.ex.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountManager {
    // try-catch X 버전
    public void method1() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);
        ;
        int balance = 0;
        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");


        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = sc.nextLine();
        System.out.print("출금할 금액을 입력하세요: ");
        balance = Integer.parseInt(sc.nextLine());

        // 계좌번호 존재 여부 확인 (null 체크)
        // 출금 금액 입력 시 NumberFormatException 처리
        // 잔액 부족 시 IllegalArgumentException 발생 및 처리
        // finally에서 Scanner 종료 및 "거래 완료" 메시지

        if (accountMap.containsKey(accountNumber)) {
            if (balance > accountMap.get(accountNumber)) {
                throw new IllegalArgumentException();
            }
        } else {
            System.out.println("계좌 번호 X");
        }

    }

    // try-catch O 버전
    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);
        ;
        int balance = 0;
        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        try {
            System.out.print("계좌번호를 입력하세요: ");
            String accountNumber = sc.nextLine();
            System.out.print("출금할 금액을 입력하세요: ");
            balance = Integer.parseInt(sc.nextLine());
            System.out.println("계좌 번호 주인 이름을 입력하세요: ");
            String owner = sc.nextLine();

            if (!owner.equals(ownerMap.get(accountNumber))) {
                throw new UserNotFoundException("일치하는 계좌의 주인이 존재하지 않습니다.");
            }

            // 계좌번호 존재 여부 확인 (null 체크)
            // 출금 금액 입력 시 NumberFormatException 처리
            // 잔액 부족 시 IllegalArgumentException 발생 및 처리
            // finally에서 Scanner 종료 및 "거래 완료" 메시지

            if (accountMap.containsKey(accountNumber)) {
                if (balance > accountMap.get(accountNumber)) {
                    throw new IllegalArgumentException();
                }
            } else {
                System.out.println("계좌 번호 X");
            }
        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 X");
        } catch (IllegalArgumentException e) {
            System.out.println("잔액 부족");
        } catch (UserNotFoundException e) {
            System.out.println("일치하는 계좌의 주인이 존재하지 않습니다.");
        } finally {
            sc.close();
            System.out.println("거래 완료");
        }
    }
}
