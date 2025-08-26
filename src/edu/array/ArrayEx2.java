package edu.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 기능용 클래스
 */
public class ArrayEx2 {

  Scanner sc = new Scanner(System.in);

  /**
   * 얕은 복사 : 주소만 복사
   */
  public void method1() {
    int[] arr1 = {100, 200, 300, 400};
    int[] arr2 = arr1;

    // 배열을 한번에 출력하는 방법
    // Arrays.toString(배열명칭)
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));

    //서로다른 변수 이름을 이용해서 값을 변경
    arr1[0] = 1234;
    arr2[1] = 5678;

    // 얕은 복사 상태이기 때문에 arr1, arr2 모두 동일한 결과
    System.out.println("arr1,arr2에 새로운 데이터 입력시 결과");
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));
  }

  /**
   * 깊은 복사 : 값을 똑같이 복사한 배열/객체 생성
   */
  public void method2() {
    int[] arr1 = {10, 20, 30, 40}; //원본 배열

    // 값을 복사할 배열(깊은 복사)
    int[] arr2 = new int[arr1.length]; // arr1의 칸수만 설정
    int[] arr3 = new int[arr1.length]; // arr1의 칸수만 설정

    System.out.println("arr1 length " + arr1.length);
    System.out.println("arr2 length " + arr2.length);
    System.out.println("arr3 length " + arr3.length);

    // 깊은 복사 방법 1 : for 이용
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i]; // arr2의 인덱스 length-1번까지 arr1의 대응값을 복제
    }
    System.out.println("=========== 복사 후 각 array의 length 값 =============");
    System.out.println("arr1 length :" + arr1.length);
    System.out.println("arr2 length :" + arr2.length);
    System.out.println("arr3 length :" + arr3.length);
    System.out.println("=========== for 후 각 ary2의 값 =============");
    System.out.println("arr2 :" + Arrays.toString(arr2));

    // 깊은 복사 방법 2 : System.arraycopy() 이용
    //System.arraycopy(arr1,          0,           arr3,          0,            arr1.length);
    //                원본배열이름      복사시작위치  복사대상배열이름  복사배열시작위치  복사총길이
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);

    System.out.println("=========== arraycopy 후 각 ary3의 값 =============");
    System.out.println("arr3 :" + Arrays.toString(arr3));
  }
}
