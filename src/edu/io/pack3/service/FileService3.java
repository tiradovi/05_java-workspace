package edu.io.pack3.service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService3 {

    public void 고전방식() {
        File file = new File("files/파일2.txt");
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 미존재");
        } catch (IOException e) {
            System.out.println("예기치 못한 문제");
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // 모두 읽은 파일을 닫을 때 문제 발생시
                } catch (Exception e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        }


    }

    public void 현대방식() {
        Path path = Path.of("files", "파일2.txt");
        if (!Files.exists(path)) {
            System.out.println("파일 없음");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("파일 읽기중 오류");
        }

    }
}
