package edu.collection.pack4.run;

import edu.collection.pack4.model.멤버;
import edu.collection.pack4.service.멤버기능서비스;

import java.util.Scanner;

public class 멤버실행파일 {
    public static void main(String[] args) {
        // 멤버 기능 서비스와
        // 다양한 모델 활용해서 실행
        Scanner sc = new Scanner(System.in);
        System.out.println("우리와 함께 다같이 [멤버] 가 되자!");
        System.out.println("=".repeat(10) + "[멤 버 회 사]" + "=".repeat(10));
        멤버기능서비스 service = new 멤버기능서비스();

        멤버 m1 = new 멤버();
        System.out.println("회원가입");
        System.out.print("성함을 입력하세요 :");
        String name = sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 :");
        String phoneNumber = sc.nextLine();
        System.out.print("이메일을 입력하세요 :");
        String email = sc.nextLine();
        멤버 m2 = new 멤버(name, phoneNumber, email);
        service.멤버조회(name, phoneNumber, email);

    }
}
