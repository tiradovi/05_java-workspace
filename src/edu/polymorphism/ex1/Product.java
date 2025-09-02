package edu.polymorphism.ex1;

public class Product {
    // 상품 정보 관련 필드들
    protected String productName;
    protected String productId;
    protected double productPrice;
    protected String productCategory;
    protected int productStock;
    protected String productDescription;
    protected String productBrand;
    protected double productWeight;

    public Product() {
    }

    public Product(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productBrand = productBrand;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    // 상품 관련 메서드들
    public void displayProductInfo() {
        System.out.println("상품명: " + getProductName());
        System.out.println("가격: " + getProductPrice() + "원");
        System.out.println("재고: " + getProductStock() + "개");
        System.out.println("브랜드: " + getProductBrand());
    }

    public void updateProductStock(int quantity) {
        setProductStock(getProductStock() + quantity);
        System.out.println("재고가 업데이트되었습니다. 현재 재고: " + getProductStock());
    }

    public void sellProduct(int quantity) {
        if (getProductStock() >= quantity) {
            setProductStock(getProductStock() - quantity);
            System.out.println(quantity + "개 판매되었습니다. 남은 재고: " + getProductStock());
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    public void applyDiscount(double discountRate) {
        double discountedPrice = getProductPrice() * (1 - discountRate);
        System.out.println("할인가: " + discountedPrice + "원 (할인율: " + (discountRate * 100) + "%)");
    }
}
