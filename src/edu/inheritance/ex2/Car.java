package edu.inheritance.ex2;

// 자동차 클래스
class Car extends Vehicle {
    private String fuelType;
    private int doors;

    public Car() {
        super();
    }

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand, model, year, color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("연료 타입: " + getFuelType());
        System.out.println("문 개수: " + getDoors());
        System.out.println("============================");
    }

    @Override
    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }

    public void honk() {
        System.out.println(getBrand() + "이(가) 빵빵! 경적을 울립니다.");
    }

    public void openTrunk() {
        System.out.println(getBrand() + "이(가) 트렁크를 엽니다.");
    }

}