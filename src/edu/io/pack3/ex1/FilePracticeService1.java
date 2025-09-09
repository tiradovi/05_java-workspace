package edu.io.pack3.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService1 {
    // Path, Files 이용

    public void method1(String dirName, String fileName) {
        Path path = Path.of(dirName, fileName);

        if (path.getParent() != null) {
            if (!Files.exists(path.getParent())) {
                System.out.println("폴더 없음");
                return;
            }
            if (!Files.isDirectory(path)) {
                System.out.println("파일 아님");
                return;
            }
        }

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
}
