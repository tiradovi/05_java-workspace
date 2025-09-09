package edu.io.pack3.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService {
    // Path, Files 이용

    public void method1(String fileName) {
        Path path = Path.of("my_logs", fileName);
        if (!Files.exists(path)) {
            System.out.println("파일 없음");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류");
        }


    }

    public void method2() {

    }
}
