package edu.polymorphism.pack3.ex2;

public class DeliveryRun {
    public static void main(String[] args) {
        BaeminApp baemin = new BaeminApp("김배달");
        baemin.showAccount();
        baemin.orderFood();
        baemin.trackOrder("B001");
        baemin.payMoney(20000);

        System.out.println();

        CoupangApp coupangEats = new CoupangApp("이주문");
        coupangEats.showAccount();
        coupangEats.orderFood();
        coupangEats.trackOrder("B002");
        coupangEats.payMoney(20000);
    }
}
