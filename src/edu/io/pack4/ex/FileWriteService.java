package edu.io.pack4.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.print("생성할 파일 이름 : ");
        String fileName = sc.nextLine();

        System.out.println("종료 입력시 파일 작성 종료");
        System.out.print("파일 내용 입력 : ");
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).toLowerCase().equals("finish")) {
            content.append(line).append(("\n"));
        }
        Path path = Path.of("my_logs", fileName);
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, content); // 경로 + 파일안에 내용 넣고 저장
            System.out.println("파일 생성 완료 : " + fileName);
        } catch (IOException e) {
            System.out.println("글자 작성중 오류");
            // 임시저장등의 기능 추가 가능
        }
    }

}
