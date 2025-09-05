package edu.exception.pack3.ex.service;

public class CartTimeoutException extends Exception {

    public CartTimeoutException(String message) {
        super(message); // 나중에 CartTimeoutException("작성한내용")출력 가능
        // 결제 처리
    }
}
