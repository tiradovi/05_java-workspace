package edu.inheritance.ex2;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 공통 메서드
    public void showInfo() {
        System.out.println("=== 교통수단 정보 ===");
        System.out.println("브랜드 : " + getBrand());
        System.out.println("모델 : " + getModel());
        System.out.println("연도 : " + getYear());
        System.out.println("색상" + getColor());
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 시동을 겁니다.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 정지합니다.");
    }

    public void accelerate() {
        System.out.println("교통수단이 가속합니다.");
    }

    public void brake() {
        System.out.println("교통수단이 감속합니다.");
    }
}
