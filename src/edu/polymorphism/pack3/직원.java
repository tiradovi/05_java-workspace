package edu.polymorphism.pack3;

/**
 * 부모클래스
 */
public abstract class 직원 implements 업무수행기능 {
    protected String name;
    protected String position;
    protected int salary;

    public 직원() {
    }

    public 직원(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "이름='" + name + '\'' +
                ", 직급='" + position + '\'' +
                ", 연봉=" + salary;
    }
}
