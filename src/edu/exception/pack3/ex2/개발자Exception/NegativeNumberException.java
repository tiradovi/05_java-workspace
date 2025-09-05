package edu.exception.pack3.ex2.개발자Exception;

// 사용자 정의 예외 클래스들
public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("음수는 입력할 수 없습니다");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
