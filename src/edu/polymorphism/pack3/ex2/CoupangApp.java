package edu.polymorphism.pack3.ex2;

public class CoupangApp extends DeliverApp implements DeliveryService {
    public CoupangApp(String userName) {
        super("쿠팡이츠", userName);
    }

    @Override
    public void orderFood() {
        System.out.println("쿠팡 주문완료! 배송으로 빠르게 이동하겠습니다.");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("쿠팡 주문번호 : " + orderId + " GPS로 실시간 추적중입니다.");
    }
}
