package edu.exception.pack3.ex2.개발자Exception;

public class InvalidScoreException extends RuntimeException {
    public InvalidScoreException() {
        super("점수는 0~100 사이여야 합니다");
    }

    public InvalidScoreException(String message) {
        super(message);
    }
}
