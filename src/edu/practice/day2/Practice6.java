package edu.practice.day2;

import java.util.Scanner;

public class Practice6 {
    Scanner sc = new Scanner(System.in);

    public void method6() {
        System.out.println("1~50 사이에 숫자를 맞혀보세요!");
        int answer = (int) (Math.random() * 50) + 1;
        int input = 0;
        int count = 0;
        final int MAX_TRIES = 7;
        do {
            count++;
            System.out.printf("시도 %d/7:", count);
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("입력한 숫자보다 정답이 작습니다.");
            } else if (input < answer) {
                System.out.println("입력한 숫자보다 정답이 큽니다.");
            } else {
                System.out.printf("정답입니다! 정답: %d, 시도횟수: %d회", answer, count);
                break;
            }

        } while (count < MAX_TRIES);

    }
}
