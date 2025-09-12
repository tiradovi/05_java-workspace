package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class 다수의직원정보작성 {
    /*
      String str = "";
      str += "이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n";
      Files.writeString(path, str.toString());
      직원 정보를 추가할 때마다 기존 str 공간은 가비지컬렉션에 의해 삭제됨
      생성 - > 기존 str 삭제 -> 생성....
     */
    public void stringMethod() {
        RealTimeWriteService service = new RealTimeWriteService();
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("직원 정보를 입력하세요. (종료 입력시 생성)");

        while (true) {
            System.out.print("직원이름 : ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                break;// 기능 중지
            }
            System.out.println("부서 : ");
            String 부서 = sc.nextLine();
            System.out.println("직급 : ");
            String 직급 = sc.nextLine();

            str += "이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n";
            System.out.println("입력 완료");
        }

        // 종료 입력시 파일저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, str.toString());
            System.out.println("파일 생성 완료 : " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /*
       StringBuilder sb = new StringBuilder();
       sb.append("이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n");
       Files.writeString(path, sb.toString());

       문자열 생성이 모두 완료될 때 까지 데이터 추가 가능
       종료를 작성하여 파일에 데이터 저장

       String = 문자열로 이루어진
       Builder = 빌딩

      */
    public void builderMethod() {
        RealTimeWriteService service = new RealTimeWriteService();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("직원 정보를 입력하세요. (종료 입력시 생성)");

        while (true) {
            System.out.println("직원이름 : ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                break;// 기능 중지
            }
            System.out.println("부서 : ");
            String 부서 = sc.nextLine();
            System.out.println("직급 : ");
            String 직급 = sc.nextLine();

            sb.append("이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n");
            System.out.println("입력 완료");
        }

        // 종료 입력시 파일저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, sb.toString());
            System.out.println("파일 생성 완료 : " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
