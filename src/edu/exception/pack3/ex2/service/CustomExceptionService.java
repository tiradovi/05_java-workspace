package edu.exception.pack3.ex2.service;

import edu.exception.pack3.ex2.개발자Exception.*;

import java.util.Scanner;

public class CustomExceptionService {

    // 문제 1: 키(cm) 입력 검증 - 음수면 예외 발생
    public void problem1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요 (cm): ");

        try {
            int height = sc.nextInt();

            // 여기에 코드를 작성하세요
            // 키가 0 이하면 NegativeNumberException을 발생시키세요
            if (height < 0) {
                throw new NegativeNumberException();
            }

            System.out.println("입력하신 키: " + height + "cm");

        } catch (NegativeNumberException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }
    }

    // 문제 2: 비밀번호 길이 검사 - 6자 미만이면 예외 발생
    public void problem2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");

        try {
            String password = sc.nextLine();

            // 여기에 코드를 작성하세요
            // 비밀번호가 6자 미만이면 TooShortPasswordException을 발생시키세요
            if (password.length() < 6) {
                throw new TooShortPasswordException();
            }

            System.out.println("비밀번호가 설정되었습니다!");

        } catch (TooShortPasswordException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    // 문제 3: 시험 점수 입력 - 0~100 범위 밖이면 예외 발생
    public void problem3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시험 점수를 입력하세요: ");

        try {
            int score = sc.nextInt();

            // 여기에 코드를 작성하세요
            // 점수가 0미만 또는 100초과면 InvalidScoreException을 발생시키세요
            if (score < 0 || score > 100) {
                throw new InvalidScoreException();
            }

            System.out.println("입력된 점수: " + score + "점");

        } catch (InvalidScoreException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }
    }

    // 문제 4: 이름 입력 - 빈 문자열이면 예외 발생
    public void problem4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");

        try {
            String name = sc.nextLine();

            // 여기에 코드를 작성하세요
            // 이름이 비어있거나 공백만 있으면 EmptyNameException을 발생시키세요
            // 힌트: name.trim().isEmpty() 사용
            if (name.trim().isEmpty()) {
                throw new EmptyNameException();
            }

            System.out.println("안녕하세요, " + name + "님!");

        } catch (EmptyNameException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    // 문제 5: 장바구니 상품 개수 - 10개 초과하면 예외 발생
    public void problem5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("장바구니에 담을 상품 개수를 입력하세요: ");

        try {
            int itemCount = sc.nextInt();

            // 여기에 코드를 작성하세요
            // 상품 개수가 10개를 초과하면 TooManyItemsException을 발생시키세요

            System.out.println("장바구니에 " + itemCount + "개 상품을 담았습니다!");
            if (itemCount > 10) {
                throw new TooManyItemsException();
            }

        } catch (TooManyItemsException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }
    }


}