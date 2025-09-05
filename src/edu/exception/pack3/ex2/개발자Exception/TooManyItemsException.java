package edu.exception.pack3.ex2.개발자Exception;

public class TooManyItemsException extends RuntimeException {
    public TooManyItemsException() {
        super("상품은 최대 10개까지만 담을 수 있습니다");
    }

    public TooManyItemsException(String message) {
        super(message);
    }
}
