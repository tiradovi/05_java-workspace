package edu.polymorphism.ex1.model;

public class Electronics extends Product {
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량


    // {} 형태로 된 블록 접기 펼치기 단축키
    // ctrl + shift +  + or - 접기 펼치기 가능

    // 생성자
    public Electronics() {
    }

    public Electronics(String powerConsumption, int warranty) {
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Electronics(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight, String powerConsumption, int warranty) {
        super(productName, productId, productPrice, "전자제품", productStock, productDescription, productBrand, productWeight);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    //         Electronics(String,         String,   double, int,     String,   String, double, int, String)
    //              ("삼성 갤럭시", "PHONE001", 800000.0, 10,  "최신 스마트폰", "삼성", 0.2, 24, "15W");
    // 게터 세터
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
}