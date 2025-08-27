package edu.oop.basic.ex;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // 기본 생성자를 활용해서 데이터 추가
        emp1.setName("김개발");
        emp1.setAge(28);
        emp1.setDepartment("개발팀");
        emp1.setPosition("주임");
        emp1.setSalary(4500);
        emp1.setEmployeeId("DEV100");
        emp1.setWorkYear(2);

        Employee emp2 = new Employee("박기획", "기획팀", "대리", "PLN007");
        // 필수 생성자를 이용해서 핵심 정보를 우선적으로 데이터 작성
        // 그후 set 활용

        /*
          Employee에 존재하지 않는 매개변수생성자 호출시 "생성자 'Employee(String, String)'을(를) 해결할 수 없습니다" 오류
                          ↓
          Employee emp2 = new Employee("박기획", "기획팀");
                          ↓
          public Employee(String 박기획, String 기획팀) {
           }
           코드 생성보다는 생성자가 어떤지 확인하는 게 좋음
         */
        emp2.setAge(32);
        emp2.setSalary(5200);
        emp2.setWorkYear(5);

        Employee emp3 = new Employee("최신입", "인사팀", "사원", "HR003");
        emp3.setAge(24);
        emp3.setSalary(3800);
        emp3.setWorkYear(1);

        // 모든 직원의 상세정보 출력
        // @Override (기존 기능 재수정)
        System.out.println("==== 직원 상세 정보 ====");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("===== 자기소개 타임 =====");
        emp1.introduce();
        emp2.introduce();
        emp3.introduce();
        System.out.println("===== 근무 현황 ======");
        emp1.work();
        emp2.work();
        emp3.work();
        System.out.println("===== 연봉 정보 ======");
        emp1.salaryInfo();
        emp2.salaryInfo();
        emp3.salaryInfo();
        System.out.println("===== 승진 대상자 확인 ======");
        emp1.checkPromotion();
        emp2.checkPromotion();
        emp3.checkPromotion();
        System.out.println("===== 퇴직금 계산 ======");
        emp1.retirement();
        emp2.retirement();
        emp3.retirement();
    }
}
