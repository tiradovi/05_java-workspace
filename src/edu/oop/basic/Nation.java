package edu.oop.basic;
// 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코드)형태로 작성해둔 문서
// 문서를 추후에 new 클래스이름() 생성자를 이용하여 객체로 호출

/**
 * 국민 객체를 만들기 위한 클래스
 */
public class Nation {
    // private 대신 public 이용하여 다른 클래스에서 Nation에 작성된 속성 기능 호출해서 사용

    /* 속성(값) public-> private*/
    private String name;        // 이름
    private int age;            // 나이
    private char gender;        // 성별
    private String juminNumer;  // 주민번호
    private String tel;         // 전화번호
    private String address;     // 주소

    public Nation() {
    }

    public Nation(String name, int age, char gender, String juminNumer, String tel, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.juminNumer = juminNumer;
        this.tel = tel;
        this.address = address;
    }

    /*************************************************************************
     Getter 활용하는 경우
     1. 다른 클래스에서 정보가 필요할 때
     2. 매개변수로 값을 전달할 때
     3. 조건문에서 값을 비교할 때
     4. 계산 작업할 때
     ----------------------------
     현재는 getter를 활용해서 setter에 저장된 데이터를 출력
     기존에는 DB에 저장된 값을 전달하는 용도
     회원가입시 이메일 인증번호 일치 여부와 같이 특정 데이터에 대한 값 확인
     주로 DB에 존재하는 데이터 전달할 때 많이 사용

     수정하기 -> DB에서 수정해야하는 게시물 번호 get 가져오기
     -> 게시물 번호에 해당하는 데이터를 get으로 전달
     **************************************************************************/
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getJuminNumer() {
        return juminNumer;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    /**
     * 사용되지 않는 메서드의 경우 회색으로 표시
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJuminNumer(String juminNumer) {
        this.juminNumer = juminNumer;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /* 기능 */
    public void speakKorean() {
        System.out.println("가나다라 한국어 가능");
    }

    public void welfare() {
        System.out.println("복지 의무");
    }

    public void 납세의무() {
        // 만 19세 이상 성인만 세금을 내는 경우
        if (age >= 19) {
            System.out.printf("%s 님은 세금 납부 대상자입니다. \n", name);
        } else {
            System.out.printf("%s 님은 %d세 미성년자로 세금 납부 대상자가 아닙니다. \n", name, age);
        }
    }

    /**
     * 자기소개기능
     * name, age, gender는 외부에서 직접 호출 불가(private)
     * introduce 메서드 활요해서 값 확인 가능
     */
    public void introduce() {
        System.out.printf("이름은 %s 이고, %d세 %c성입니다. \n", name, age, gender);
    }


}
