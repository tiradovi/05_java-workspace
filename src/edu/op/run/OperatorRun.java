package edu.op.run;

import edu.op.ex.OperatorEx;

/**
 * 실행용 클래스
 */

public class OperatorRun {

  // static 이 작성된 기능이나 변수이름 메모리에서 프로그램을 사용할 때 상시 사용처럼
  // 메모리 공간을 차지하는 예약어

  /**
   * Stack (빠른 비서같은 존재) - 어디에 어떤 기능이 존재하는지 주소만 기억 - 기능(행동) 역할이 종료되면 버리고, 다른 기능을 수행할 준비 - 실질적으로 기능이
   * 존재하는 주소만 알고 있음
   * <p>
   * Heap (창고지기) - Stack에서 주소값으로 연결되어 들어가면 존재하는 실제 물건들의 위치 - 누군가 클래스로 만들어진 객체를 사용하면 보관, 사용하지 않으면
   * 불필요한 객체나 기능으로 판단하여 버림 - 실제 데이터를 저장하는 공간 (크기 다양)
   *
   */
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
    //new OperatorEx().test(); //이렇게도 가능은 하지만 매번 새로운 객체를 생성하기에 지양

    op.method1();
    op.method2();
    op.method3();
  }
}
