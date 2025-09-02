package edu.inheritance.ex0;

public class 디자이너 extends 직원 {
    /*
    기존에 하나하나 직접 작성해야하는 필드 명칭에서 공통적으로 활용할 필드 명칭을 작성후
    extends 직원을 활용하여 추가 필요한 필드 명칭만 작성
    private String eName;
    private int eId;
    private double baseSalary;
    private String department;

     */
    private String designTool;

    public 디자이너(String eName, int eId, double baseSalary, String department, String designTool) {
        super(eName, eId, baseSalary, department);
        this.designTool = designTool;
    }

    public String getDesignTool() {
        return designTool;
    }

    public void setDesignTool(String designTool) {
        this.designTool = designTool;
    }

    /**
     * @Override 표기는 extends 상속클래스로 가져온 기능을 재활용한다는 표기
     * 작성하지 않아도 동작하나 컨벤션상 작성
     */
    @Override
    public void info() {
        super.info();
        System.out.println("주 사용 디자인 도구:" + getDesignTool());
    }

    @Override
    public void work() {
        //super.work(); 는 부모에 작성된 기능을 추가로 사용하고자 할 때 작성
        // 즉 필수 아님
        System.out.println(geteName() + "디자이너가 " + getDesignTool() + "을 활용해 디자인 합니다.");
    }
}
