package edu.inheritance.ex1;

// 생성자를 만들어주지 않은 경우 에러 발생 부모의 필드를 활용할 수있는 생성자가 존재하지 않기 때문
class Cat extends Animal {
    private boolean isIndoor;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public Cat(String name, int age, String color, boolean isIndoor) {
        super(name, age, color);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 야옹 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 조용히 걸어다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("실내묘 여부 : " + (isIndoor() ? ("실내묘") : ("실외묘")));
        System.out.println("=====================");
        System.out.println();
    }

    public void purr() {
        System.out.println(getName() + "이(가) 골골 소리를 냅니다!");
    }

    public void scratch() {
        System.out.println(getName() + "이(가) 발톱으로 긁습니다.");
    }
}