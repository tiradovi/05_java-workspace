package edu.polymorphism.ex1.model;

// @생성자 @파라미터생성자 @게터 @세터 @toString 모두 어노테이션으로 추후 생성할 것!
public class Food extends Product {
    private String expirationDate; // 유통기한
    private String origin; // 원산지
    private boolean isOrganic; // 유기농 여부


    public Food() {
    }

    public Food(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Food(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight, String expirationDate, String origin, boolean isOrganic) {
        super(productName, productId, productPrice, "음식", productStock, productDescription, productBrand, productWeight);
        // Food(    "사과", "APPLE001",       5000.0,                   100,                "국산 사과",       "농협",  1.0, "2025-09-15", "한국", true);

        this.expirationDate = expirationDate;
        this.origin = origin;
        this.isOrganic = isOrganic;
    }

    // 게터 세터
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }
}