package edu.exception.pack3.ex2.개발자Exception;

public class TooShortPasswordException extends RuntimeException {
    public TooShortPasswordException() {
        super("비밀번호가 너무 짧습니다 (최소 6자)");
    }

    public TooShortPasswordException(String message) {
        super(message);
    }
}
