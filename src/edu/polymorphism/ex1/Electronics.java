package edu.polymorphism.ex1;

public class Electronics extends Product {
    // 전자제품 관련 필드들
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량

    public Electronics() {
    }

    public Electronics(int warranty, String powerConsumption) {
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    // 전자제품 관련 메서드들
    public void displayElectronicsInfo() {
        if (getProductCategory().equals("전자제품")) {
            System.out.println("보증기간: " + getWarranty() + "개월");
            System.out.println("전력소비량: " + getPowerConsumption());
        }
    }

}
