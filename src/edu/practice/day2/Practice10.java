package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice10 {
    Scanner sc = new Scanner(System.in);

    public void method10() {
        int randomNum = 0;
        boolean isDuplicate = false;
        String playAgain = "y";
        System.out.println("=== 간단 로또 번호 생성기 ===");
        while (!playAgain.equals("n")) {
            int[] lotto = new int[5];
            for (int i = 0; i < lotto.length; i++) {
                isDuplicate = false;
                randomNum = (int) (Math.random() * 20) + 1;
                for (int j = 0; j < i; j++) {
                    if (randomNum == lotto[j]) {
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    i--;
                } else {
                    lotto[i] = randomNum;
                }
            }

            System.out.println("생성된 번호:" + Arrays.toString(lotto));
            System.out.print("다시 생성하시겠습니까? (y/n):");
            playAgain = sc.nextLine();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
