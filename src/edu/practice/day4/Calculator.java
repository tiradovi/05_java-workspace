package edu.practice.day4;

public class Calculator {

    public static void calculate() {
        System.out.println("기본 실행: 계산기 실행");
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    return 0;
                }
                return a / b;
            default:
                return 0;
        }

    }

    public static int calculate(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
