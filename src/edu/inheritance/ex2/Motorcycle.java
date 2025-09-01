package edu.inheritance.ex2;

// 오토바이 클래스
class Motorcycle extends Vehicle {
    private int engineSize;
    private boolean hasHelmet;

    public Motorcycle() {
    }

    public Motorcycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);

    }

    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("배기량 : " + getEngineSize());
        System.out.println("헬멧 착용 여부: " + (isHasHelmet() ? ("착용") : ("미착용")));
        System.out.println("============================");
    }

    @Override
    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }

    public void wheelie() {
        System.out.println(getBrand() + "이(가) 앞바퀴를 들고 윌리를 합니다!");
    }

    public void putOnHelmet() {
        System.out.println(getBrand() + "이(가) 안전을 위해 헬멧을 착용합니다.");
    }

}