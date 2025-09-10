package edu.io.pack4.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void 고전방식() {
        System.out.print("생성할 파일이름을 입력하세요 : ");
        String fileName = sc.nextLine();

        System.out.println("종료 를 입력하면 파일작성이 종료됩니다.");
        System.out.print("파일에 쓸 내용을입력하세요 :");

        // 문자열로 빌딩을 짓는다. 탑처럼쌓아올린 문자열을 만드는 클래스
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("종료")) {
            content.append(line).append("\n"); // 한줄 씩 더해주고, 엔터를 입력할 때 마다 줄바꿈처리하기
        }

        // 모두 작성하기를 종료하면  files/ 폴더 내에 특정 파일이름으로 저장하기
        File file = new File("files/" + fileName);

        // 디렉토리가 없으면 생성
        if (!file.exists()) {
            file.getParentFile().mkdirs(); //폴더 먼저 생성
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            System.out.println("파일 생성 및 쓰기 완료 : " + fileName);
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 발생");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는 중 문제가 발생하여 파일을 저장하지 못한 상태");
                }
            }
            sc.close(); // 스캐너 입력 닫기 처리
        }
    }


    public void 현대방식() {
        System.out.print("생성할 파일이름을 입력하세요 : ");
        String fileName = sc.nextLine();

        System.out.println("종료 를 입력하면 파일작성이 종료됩니다.");
        System.out.print("파일에 쓸 내용을입력하세요 :");
        StringBuilder content = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("종료")) {
            content.append(line).append("\n");
        }

        // 여기부터 다름

        Path path = Path.of("files/" + fileName);
        // getParent 는 파일이름.확장자이름이 나오기 전까지의 폴더 경로
        try {
            // 폴더들이 존재하지 않으면  생성 mkdir   / mkdirs 로 구분하지말고
            // 폴더들이라는 전제하에 없으면 생성하겠다. createDirectories() 기능 사용
            Files.createDirectories(path.getParent());
            Files.writeString(path, content.toString()); // 경로 + 파일 안에 작성내용 넣고 저장하기
            // 저장하기 = close 와 같음
            System.out.println("파일 생성 완료 : " + fileName);
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
        }
    }
}