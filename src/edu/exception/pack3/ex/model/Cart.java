package edu.exception.pack3.ex.model;

import java.time.LocalDateTime;

public class Cart {
    private String userId;
    private LocalDateTime createTime;

    public Cart() {
    }

    public Cart(String userId) {
        this.userId = userId;
        this.createTime = LocalDateTime.now();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
