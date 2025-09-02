package edu.inheritance.ex2;

/**
 * 교통수단 클래스 상속 실습 문제
 * <p>
 * Vehicle 부모 클래스와 Car, Motorcycle, Bicycle 자식 클래스들을 활용하여
 * 상속의 개념과 메소드 오버라이딩을 연습합니다.
 */
public class VehicleInheritanceRun {

    public static void main(String[] args) {

        // ============== 문제 1: 기본 생성자 + Setter 활용 ==============
        // Car 객체를 기본 생성자로 생성하고 setter로 다음 정보를 설정하세요.
        // 브랜드: "현대", 모델: "아반떼", 연도: 2023, 색상: "흰색", 연료타입: "가솔린", 문개수: 4

        Car car1 = new Car();
        // 여기에 setter 메소드들을 사용하여 정보 설정
        car1.setBrand("현대");
        car1.setModel("아반떼");
        car1.setYear(2023);
        car1.setColor("흰색");
        car1.setFuelType("가솔린");
        car1.setDoors(4);

        // ============== 문제 2: 매개변수 생성자 활용 ==============
        // Motorcycle 객체를 매개변수 생성자로 생성하세요.
        // 브랜드: "야마하", 모델: "R1", 연도: 2022, 색상: "파란색", 배기량: 998, 헬멧착용: true

        // 여기에 코드 작성
        Motorcycle motorcycle1 = new Motorcycle("야마하", "R1", 2022, "파란색", 998, true);


        // ============== 문제 3: 다양한 생성자 활용 ==============
        // Bicycle 객체 두 개를 서로 다른 생성자로 생성하세요.
        // bike1: 4개 매개변수 생성자 사용 ("트렉", "FX", 2023, "검정색")
        // bike2: 6개 매개변수 생성자 사용 ("자이언트", "이스케이프", 2023, "빨간색", 21, true)

        // 여기에 코드 작성
        Bicycle bike1 = new Bicycle("트렉", "FX", 2023, "검정색");
        Bicycle bike2 = new Bicycle("자이언트", "이스케이프", 2023, "빨간색", 21, true);


        // ============== 문제 4: 교통수단 정보 출력 ==============
        // 모든 교통수단의 기본 정보를 showInfo() 메소드로 출력하세요.
        Vehicle[] Vehicles = {car1, motorcycle1, bike1, bike2};

        // 여기에 코드 작성
        for (Vehicle info : Vehicles) {
            System.out.println("=== 교통수단 정보 ===");
            info.showInfo();
            System.out.println("\n=== 시동 걸기 ===");
            info.start();
            System.out.println("\n=== 정지하기 ===");
            info.stop();
        }
//        car1.showInfo();
//        motorcycle1.showInfo();
//        bike1.showInfo();
//        bike2.showInfo();

        // ============== 문제 5: 공통 행동 테스트 ==============
        // 모든 교통수단이 시동을 걸고 정지하는 행동을 해보세요. (start, stop 메소드)


        // 여기에 코드 작성
//        car1.start();
//        motorcycle1.start();
//        bike1.start();
//        bike2.start();

        // 여기에 코드 작성
//        car1.stop();
//        motorcycle1.stop();
//        bike1.stop();
//        bike2.stop();

        // ============== 문제 6: 오버라이딩된 메소드 테스트 ==============
        // 각 교통수단의 고유한 가속과 제동 방식을 확인하세요.

        System.out.println("\n=== 가속 방식 ===");
        // 여기에 accelerate() 메소드 호출
        car1.accelerate();
        motorcycle1.accelerate();
        bike1.accelerate();
        bike2.accelerate();

        System.out.println("\n=== 제동 방식 ===");
        // 여기에 brake() 메소드 호출
        car1.brake();
        motorcycle1.brake();
        bike1.brake();
        bike2.brake();


        // ============== 문제 7: 각 교통수단의 고유 메소드 실행 ==============
        // 자동차: honk(), openTrunk()
        // 오토바이: wheelie(), putOnHelmet()
        // 자전거: ringBell(), pedal()

        System.out.println("\n=== 교통수단별 특별한 행동 ===");
        // 여기에 코드 작성
        car1.honk();
        car1.openTrunk();
        motorcycle1.wheelie();
        motorcycle1.putOnHelmet();
        bike1.ringBell();
        bike1.ringBell();
        bike2.pedal();
        bike2.pedal();

        // ============== 문제 8: 상속 관계 확인 ==============
        // instanceof 연산자를 사용하여 각 객체가 Vehicle의 인스턴스인지 확인하세요.

        System.out.println("\n=== 상속 관계 확인 ===");
        // 여기에 instanceof 확인 코드 작성
        // 예: System.out.println("car1은 Vehicle의 인스턴스입니다: " + (car1 instanceof Vehicle));
        System.out.println("car1은 Vehicle의 인스턴스입니다: " + (car1 instanceof Vehicle));
        System.out.println("motorcycle1은 Vehicle의 인스턴스입니다: " + (motorcycle1 instanceof Vehicle));
        System.out.println("bike1은 Vehicle의 인스턴스입니다: " + (bike1 instanceof Vehicle));
        System.out.println("bike2은 Vehicle의 인스턴스입니다: " + (bike2 instanceof Vehicle));


        // ============== 문제 9: 정보 수정 후 재확인 ==============
        // car1의 연도를 2024로, 연료타입을 "하이브리드"로 변경한 후 정보를 다시 출력하세요.

        System.out.println("\n=== 정보 수정 후 ===");
        // 여기에 코드 작성
        car1.setYear(2024);
        car1.setFuelType("하이브리드");
        car1.showInfo();

        // ============== 문제 10: Super 키워드 이해 ==============
        // 자식 클래스 생성자에서 부모 생성자가 어떻게 호출되는지 확인해보세요.
        // 새로운 Car 객체를 여러 생성자로 만들어 차이점을 관찰하세요.

        System.out.println("\n=== Super 키워드 테스트 ===");
        Car car2 = new Car(); // 기본 생성자
        Car car3 = new Car("기아", "K5", 2023, "회색"); // 4개 매개변수 생성자
        Car car4 = new Car("BMW", "320i", 2023, "검정색", "디젤", 4); // 6개 매개변수 생성자

        // 각 자동차 정보 출력해보기
        car2.showInfo();
        car3.showInfo();
        car4.showInfo();

        // ============== 보너스 문제 1: 메소드 오버라이딩 vs 부모 메소드 ==============
        // Vehicle의 기본 accelerate()와 자식의 오버라이딩된 accelerate() 비교

        System.out.println("\n=== 오버라이딩 비교 ===");
        Vehicle vehicle = new Vehicle("일반", "교통수단", 2023, "무색");
        vehicle.accelerate(); // 부모 클래스 메소드
        car1.accelerate();    // 오버라이딩된 메소드


        // ============== 보너스 문제 2: 생성자 체이닝 ==============
        // 같은 정보를 가진 교통수단을 서로 다른 방식으로 생성해보세요.
        // 방식1: 기본 생성자 + setter들
        // 방식2: 매개변수 생성자

        System.out.println("\n=== 생성자 방식 비교 ===");
        // 같은 정보("혼다", "시빅", 2023, "은색")를 가진 두 개의 Car 객체를 다른 방식으로 생성
        Car car5 = new Car();
        car5.setBrand("혼다");
        car5.setModel("시빅");
        car5.setYear(2023);
        car5.setColor("은색");

        Car car6 = new Car("혼다", "시빅", 2023, "은색");

        car5.showInfo();
        car6.showInfo();

        // ============== 보너스 문제 3: 교통수단 종류별 통계 ==============
        // 각 교통수단별 연도 평균과 가장 최신 모델을 찾아보세요.

        System.out.println("\n=== 교통수단 통계 ===");
        // 여기에 통계 계산 코드 작성


        System.out.println("\n🚦 교통수단 관리 시스템 종료!");
    }
}
