package edu.practice.day2;

import java.util.Scanner;

public class Practice8 {
    Scanner sc = new Scanner(System.in);

    public void method8() {
        int[] scores = new int[5];
        int total = 0;
        double average = 0;
        int max = 0;
        int min = 100;

        System.out.println("5명의 성적을 입력하세요");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d번 학생:", i + 1);
            scores[i] = sc.nextInt();
            total += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("=== 성적 통계===");
        System.out.printf("총점: %d점\n", total);
        System.out.printf("평균: %.1f점\n", (double) total / 5);
        System.out.printf("최고점: %d점\n", max);
        System.out.printf("최저점: %d점\n", min);

    }

}
