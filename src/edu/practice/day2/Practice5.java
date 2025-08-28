package edu.practice.day2;

import java.util.Scanner;

public class Practice5 {
    Scanner sc = new Scanner(System.in);

    public void method5() {
        int choice = 0;
        int dan = 0;

        // """  """ : <pre></pre>
        while (true) {
            System.out.println("=== 구구단 프로그램===");
            System.out.println("1. 특정 단 출력");
            System.out.println("2. 전체 구구단 출력");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("몇 단을 출력하시겠습니까?");
                    dan = sc.nextInt();
                    System.out.printf("[%d단]", dan);
                    for (int i = 1; i <= dan; i++) {
                        System.out.printf("%d × %d = %2d \n", dan, i, dan * i);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 9; i++) {
                        for (int j = 1; j <= 9; j++) {
                            System.out.printf("%d × %d = %2d \n", i, j, i * j);
                        }
                    }
                    break;
                case 0:
                    System.out.print("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력");
                    break;
            }


        }
    }
}
