package edu.oop.basic.ex;

public class ProductRun {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setpName("갤럭시 S24");
        p1.setPrice(1200000);
        p1.setBrand("삼성");

        Product p2 = new Product();
        p2.setpName("아이폰 15");
        p2.setPrice(1300000);
        p2.setBrand("애플");
        
        System.out.println("p1 p2 실행 결과:");
        System.out.println("=== p1 실행 결과 ===");
        p1.information();
        System.out.println("=== p1 실행 결과 ===");
        p2.information();
    }
}
