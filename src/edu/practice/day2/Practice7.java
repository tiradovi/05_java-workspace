package edu.practice.day2;

import java.util.Scanner;

public class Practice7 {
    Scanner sc = new Scanner(System.in);

    public void method7() {
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        int totalCount = str.length(), letterCount = 0, digitCount = 0, otherCount = 0;
        char ch;
        for (int i = 0; i < totalCount; i++) {
            ch = str.charAt(i);

            /**
             * Character.isDigit(ch)
             * Character.isLetter(ch)
             * 문자가 숫자인지 글자인지 boolean형태로 반환
             */
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("=== 문자열 분석 결과===");
        System.out.println("총 글자 수: " + totalCount);
        System.out.println("영문자: " + letterCount);
        System.out.println("숫자: " + digitCount);
        System.out.println("기타: " + otherCount);
    }
}
