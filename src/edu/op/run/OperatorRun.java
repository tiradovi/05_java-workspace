package edu.op.run;

import edu.op.ex.OperatorEx;

/**
 * 실행용 클래스
 */

public class OperatorRun {

  public static void main(String[] args) {

    /**
     * OperatorEx = 코드가 작성된 클래스 이름(=파일명)
     * op = 참조 변수 이름
     * new = 프로그램을 실행하기 위하여 새로 생성해서 사용
     */
    OperatorEx op = new OperatorEx();
    // ex 폴더에서 만들어 놓은 OperatorEx 파일을 가져와서 사용
    // 가져와서 OperatorRun 클래스 내부에서 사용할 때
    // op 별칭을 붙여준 후 사용
    op.test();

    // 기존의 어떤 개발자가 만들어놓은 파일을 가져와서 기능이나 변수값활용시
    new OperatorEx().test(); //이렇게도 가능은 하다

    op.method1();
  }
}
