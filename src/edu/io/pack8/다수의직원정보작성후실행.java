package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class 다수의직원정보작성후실행 {
    public static void main(String[] args) {
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
