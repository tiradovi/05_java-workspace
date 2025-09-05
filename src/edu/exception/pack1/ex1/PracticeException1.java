package edu.exception.pack1.ex1;

import java.util.Scanner;

public class PracticeException1 {
    Scanner sc = new Scanner(System.in);

    // 단축키 : 코드 블록 드래그 후 : ctrl + alt + t 작성
    // if 부터 try-catch while 등의 코드 블록에 대한 상황 설정 가능
    public void method1() {

        System.out.print("정수 입력 1 :");
        int input1 = sc.nextInt();
        System.out.print("정수 입력 2 :");
        int input2 = sc.nextInt();

        try {
            System.out.println(input1 / input2);
        } catch (ArithmeticException e) {
            System.out.println("input1 : " + input1);
            System.out.println("input2 : " + input2);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
