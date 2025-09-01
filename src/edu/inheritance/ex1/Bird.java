package edu.inheritance.ex1;

class Bird extends Animal {
    private double wingspan;

    public Bird() {
        super();
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    public Bird(String name, int age, String color, double wingspan) {
        super(name, age, color);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 짹짹 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 날아다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("날개 길이 : " + getWingspan());
        System.out.println("=====================");
        System.out.println();
    }

    public void fly() {
        System.out.println(getName() + "이(가) 높이 날아오릅니다!");
    }

    public void buildNest() {
        System.out.println(getName() + "이(가) 둥지를 만듭니다.");
    }

}