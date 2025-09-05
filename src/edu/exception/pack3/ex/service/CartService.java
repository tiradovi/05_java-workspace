package edu.exception.pack3.ex.service;

public class CartService {
    public void 장바구니시간체크기능(String userId) {
        // 만약 장바구니 보관시간이 최대 30분인데 30분을 초과했을 경우
        try {
            throw new CartTimeoutException("장바구니 보관시간 만료");
        } catch (CartTimeoutException e) {
            System.out.println("장바구니 시간이 만료되었으므로 백엔드에서 가지고 있던 데이터 삭제");
        }
    }
}
