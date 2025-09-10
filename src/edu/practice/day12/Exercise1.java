package edu.practice.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise1 {
    public void solution1(String dirName, String fileName) {
        Path folderPath = Path.of(dirName);
        try {
            Files.createDirectories(folderPath);
            // 파일 경로 만들기
            Path filePath = Path.of(dirName, fileName);


            // 경로 내에 만들어진 파일에 내용 작성하기
            String content = "안녕하세요 자바 파일 처리 연습중입니다.";

            Files.writeString(filePath, content);
            System.out.println(filePath + "파일 생성 완료!"); //파일 명칭출력
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void solution2(String dirName, String fileName) {
        Path filePath = Path.of(dirName, fileName);
        String content;
        if (!Files.exists(filePath)) {
            System.out.println("파일을 찾을 수 없습니다.");
            return;
        }


        try {
            content = Files.readString(filePath);
            System.out.println("파일 내용 : " + content);
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다.");
        }
    }

    public void solution3(String dirName, String fileName) {
        Path filePath = Path.of(dirName, fileName);
        String content = "오늘의 메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";


        try {
            Files.writeString(filePath, content);
            System.out.println(filePath + "파일 생성 완료!");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
            System.out.println("회사에서 지시내린 규칙대로");
            System.out.println("개발자는 추후 필요한 조치를 취해야함");
        }


    }

    public void solution4() {
        Path filePath = Path.of("practice", "temp.txt");
        String content = "임시파일입니다";
        // 파일 생성 + 생성된 파일에 내용 작성하기
        try {
            Files.writeString(filePath, content);
            if (Files.exists(filePath)) {
                System.out.println(filePath + " 파일이 존재합니다.");

                Files.delete(filePath);
                System.out.println("temp.txt 파일 삭제 완료되었습니다!");
                System.out.println("파일이 삭제되었는지 확인 : " + Files.exists(filePath));
            }
            ;

        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생");
        }

    }

    public void solution5(String 폴더1번, String 폴더2번, String 폴더3번) {
        // 폴더 구조만 생성
        Path dirPath = Path.of(폴더1번, 폴더2번, 폴더3번);
        try {
            Files.createDirectories(dirPath);
            // 파일의 위치 + 파일이름
            Path note1Path = Path.of(폴더1번, 폴더2번, 폴더3번, "note1.txt");
            Path note2Path = Path.of(폴더1번, 폴더2번, 폴더3번, "note2.txt");

            // 파일 내용들
            String note1Content = "자바 기초 공부중";
            String note2Content = "파일 처리 배우는 중";

            // 파일을 생성하고 내용 작성하기
            Files.writeString(note1Path, note1Content);
            Files.writeString(note2Path, note2Content);
            System.out.println("모든 파일 생성 완료");

            // 만들어진 파일 내용 읽기 및  출력

            String note1Read = Files.readString(note1Path);
            String note2Read = Files.readString(note2Path);

            System.out.println("note1 의 파일 내용 : " + note1Read);
            System.out.println("note2 의 파일 내용 : " + note2Read);

        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생");
        }


    }
}