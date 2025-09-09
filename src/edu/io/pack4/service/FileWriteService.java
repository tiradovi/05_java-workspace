package edu.io.pack4.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void 고전방식() {
        System.out.print("생성할 파일 이름 : ");
        String fileName = sc.nextLine();

        System.out.println("종료 입력시 파일 작성 종료");
        System.out.print("파일 내용 입력 : ");

        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals(("종료"))) {
            content.append(line).append(("\n"));
        }
        File file = new File("files/" + fileName);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            System.out.println("파일 생성 완료");
        } catch (IOException e) {
            System.out.println("파일 쓰기중 오류 발생");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("파일 닫는 중 문제 발생");
                }
            }
            sc.close();
        }
    }

    public void 현대방식() {
        System.out.print("생성할 파일 이름 : ");
        String fileName = sc.nextLine();

        System.out.println("종료 입력시 파일 작성 종료");
        System.out.print("파일 내용 입력 : ");
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("종료")) {
            content.append(line).append(("\n"));
        }
        Path path = Paths.get("files/" + fileName);
        try {
            // 폴더들이 존재하지 않으면 생성 mkdir/ mkdirs 가 아닌
            // 폴더가 없으면 생성 createDirectories
            Files.createDirectories(path.getParent());
            Files.writeString(path, content.toString()); // 경로 + 파일안에 내용 넣고 저장
            System.out.println("파일 생성 완료" + fileName);
        } catch (IOException e) {
            System.out.println("파일 생성 오류");
        }

    }
}
