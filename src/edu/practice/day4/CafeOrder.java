package edu.practice.day4;

public class CafeOrder {
    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;

    public static int totalOrders;
    public static int totalSales;

    private String customerName;
    private String menuItem;
    private int price;
    private int orderNumber;
    private int tax;

    static {
        System.out.println("=== " + CAFE_NAME + " 시스템 시작 ===");
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getTax() {
        return tax;
    }

    public void placeOrder() {
        setOrderNumber(totalOrders + 1);
        setTax(getTax() + (int) (getPrice() * TAX_RATE));
        totalSales += getPrice() + getTax();
        totalOrders++;
    }

    public void printReceipt() {
        System.out.println("===== " + CAFE_NAME + " 영수증 =====");
        System.out.println("주문번호:" + getOrderNumber());
        System.out.println("고객명:" + getCustomerName());
        System.out.println("메뉴:" + getMenuItem());
        System.out.println("금액:" + getPrice());
        System.out.println("세금:" + getTax());
        System.out.println("총액:" + (getPrice() + getTax()));
        System.out.println("=================================");
        System.out.println();
    }
}
