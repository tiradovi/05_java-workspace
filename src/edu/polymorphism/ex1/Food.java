package edu.polymorphism.ex1;

public class Food extends Product {
    // 식품 관련 필드들
    private String expirationDate; // 유통기한
    private String origin; // 원산지
    private boolean isOrganic; // 유기농 여부

    public Food() {
    }

    public Food(String expirationDate, String origin, boolean isOrganic) {
        this.expirationDate = expirationDate;
        this.origin = origin;
        this.isOrganic = isOrganic;
    }

    public Food(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Food(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, String expirationDate, String origin, boolean isOrganic) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.expirationDate = expirationDate;
        this.origin = origin;
        this.isOrganic = isOrganic;
    }

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

    // 식품 관련 메서드들
    public void displayFoodInfo() {
        if (getProductCategory().equals("식품")) {
            System.out.println("유통기한: " + getExpirationDate());
            System.out.println("원산지: " + getOrigin());
            System.out.println("유기농 여부: " + (isOrganic() ? "유기농" : "일반"));
        }
    }

    public void checkFoodExpiration() {
        if (getProductCategory().equals("식품")) {
            System.out.println("유통기한을 확인하세요: " + getExpirationDate());
        }
    }

}
