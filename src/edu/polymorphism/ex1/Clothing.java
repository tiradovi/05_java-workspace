package edu.polymorphism.ex1;

public class Clothing extends Product {
    // 의류 관련 필드들
    private String size;
    private String color;
    private String material;

    public Clothing() {
    }

    public Clothing(String size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public Clothing(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Clothing(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, String size, String color, String material) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // 의류 관련 메서드들
    public void displayClothingInfo() {
        if (getProductCategory().equals("의류")) {
            System.out.println("사이즈: " + getSize());
            System.out.println("색상: " + getColor());
            System.out.println("소재: " + getMaterial());
        }
    }
}
