package edu.oop.basic.ex;

public class Product {
    private String pName;
    private int price;
    private String brand;

    public Product() {
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void information() {
        System.out.printf("제품명: %s \n", getpName());
        System.out.printf("가격: %d원 \n", getPrice());
        System.out.printf("브랜드: %s \n\n", getBrand());
    }
}
