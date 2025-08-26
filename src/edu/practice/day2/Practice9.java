package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice9 {
    Scanner sc = new Scanner(System.in);

    public void method9() {
        System.out.println("배열 크기를 입력하세요 (1~10): ");
        int size = sc.nextInt();
        int[] original = new int[size];
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("%d번째 숫자: ", i + 1);
            original[i] = sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            reversed[i] = original[size - i - 1];
        }
        System.out.println("원본 배열: " + Arrays.toString(original));
        System.out.println("뒤집힌 배열: " + Arrays.toString(reversed));

    }

}
