package edu.oop.basic;

/**
 * Nation 클래스를 활용한 객체 생성 및 조작 실습
 */
public class NationRun {
    public static void main(String[] args) {
        Nation n1 = new Nation();

        /*
        public String name;        // 이름
        public int age;            // 나이
        public char gender;        // 성별
        public String juminNumer;  // 주민번호
        public String tel;         // 전화번호
        public String address;     // 주소
         */

        // 이름: 김철수, 나이: 25, 성별: '남', 주민등록번호:"965233-123456", 전화번호 :"010-1234-5678", 주소: "서울시 강남구"
        // 자료형이 public 인 경우 다음과 같이 작성 가능
        /*
        n1.name = "홍길동";
        n1.age = 25;
        n1.gender = '남';
        System.out.printf("이름은 %s 이고, %d세 %c성입니다. \n", n1.name, n1.age, n1.gender);
         */

        // ====== 문제 1: 자료형이 private인 경우======
        n1.setName("홍길동");
        n1.setAge(25);
        n1.setGender('남');
        n1.setTel("010-1234-5678");
        n1.setAddress("서울시 강남구");
        // System.out.printf("이름은 %s 이고, %d세 %c성입니다. \n", n1.getName(), n1.getAge(), n1.getGender());

        //====== 문제 2 : 필수 생성자 활용======
        // 이름: "이영희", 나이: 17, 성별: '여', 주민등록번호: "070312-4567890"
        // 전화번호 : "010-9876-5432", 주소: "부산시 해운대구"
        Nation n2 = new Nation("이영희", 17, '여', "070312-4567890", "010-9876-5432", "부산시 해운대구");

        //====== 문제 3: 필수 생성자 활용 =======
        Nation n3 = new Nation("박민수", 43, '남', "820525-1987654", "010-5555-7777", "대구시 중구");

        //========= 자기소개 =============
        n1.introduce();
        n2.introduce();
        n3.introduce();

        // ========== 납세의 의무 확인 ======
        n1.납세의무();
        n2.납세의무();
        n3.납세의무();

        // ===== 한국어 능력 및 복지 혜택 확인 ====
        n1.welfare();
        n1.speakKorean();
        n2.welfare();
        n2.speakKorean();
        n3.welfare();
        n3.speakKorean();

    }
}
