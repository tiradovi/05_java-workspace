package edu.oop.basic.ex;

public class Employee {
    /* 속성(필드) - private으로 캡슐화 */
    private String name;         // 이름
    private int age;             // 나이
    private String department;   // 부서
    private String position;     // 직급
    private int salary;          // 연봉 (만원 단위)
    private String employeeId;   // 사원번호
    private int workYear;        // 근무년수

    /* 기능(메서드) */
    // 기본
    public Employee() {
    }

    // 필수
    public Employee(String name, String department, String position, String employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }


    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    // getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getWorkYear() {
        return workYear;
    }

    // 필요 기능

    /**
     * 회사원 자기소개
     */
    public void introduce() {
        System.out.printf("안녕하세요. %s부서 %s %s입니다\n", getDepartment(), getPosition(), getName());
    }

    /**
     * 근무 상태 출력
     */
    public void work() {
        System.out.printf("%s님이 %s부서에서 근무중입니다.\n", getName(), getDepartment());
    }

    /**
     * 연봉 정보 출력
     */
    public void salaryInfo() {
        System.out.printf("%s 님의 연봉: %,d만원\n", getName(), getSalary());
    }

    /**
     * 승진 가능 여부 확인
     * 근무년수 3년 이상 승진 가능
     * <p>
     * 추후에는 속성만 작성해놓은 클래스
     * 속성을 활용한 기능을 작성해놓은 클래스
     * 속성과 기능을 활용해서 실행하는 클래스
     */
    public void checkPromotion() {
        if (workYear >= 3) {
            System.out.printf("%s님은 근무년수 %2d년으로 승진 대상자입니다.", getName(), getWorkYear());
        } else {
            System.out.printf("%s님은 근무년수 %2d년으로 승진까지 %2d년 더 필요합니다.", getName(), getWorkYear(), 3 - getWorkYear());
        }
    }

    /**
     * 퇴직금 계산(간단 계산: 연봉 X 근무년수)
     */
    public void retirement() {
        int retirement = salary * workYear;
        System.out.printf("%s님의 예상 퇴직금 : %,d만원(연봉 %,d만원 X 근무년수 %d년)\n", getName(), retirement, getSalary(), getWorkYear());

    }

    /**
     * 상세정보 출력 기능
     * 자바 자체에 존재하는 기능
     *
     * @return String 문자열 형태로 회사원의 모든 정보를 전달해서 출력
     * // @Override -> 추후 함께 공부해볼 어노테이션
     * // @ --> at, 어노테이션
     */
    @Override
    public String toString() {
        return "Employee{" +
                "이름='" + name + '\'' +
                ", 나이=" + age +
                ", 부서='" + department + '\'' +
                ", 직급='" + position + '\'' +
                ", 연봉=" + salary +
                ", 사원번호='" + employeeId + '\'' +
                ", 근무년수=" + workYear +
                '}';
    }
}

