package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {

    public void method5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출생년도를 입력하세요: ");
        int birthYear = sc.nextInt();
        final int CURRENT_YEAR = 2025;
        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);
        int zodiacIndex = birthYear % 12;
        String[] zodiacAnimals = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};

        System.out.println("======== 나이 정보 ========");
        System.out.printf("출생년도 : %d년 \n", birthYear);
        System.out.printf("현재 나이 : %d세 \n", currentAge);
        System.out.printf("10년 후 : %d세 \n", futureAge);
        System.out.printf("성인 여부 : %b \n", isAdult);
        System.out.printf("%s띠 \n", zodiacAnimals[zodiacIndex]);
        System.out.println("=========================");


    }
}
