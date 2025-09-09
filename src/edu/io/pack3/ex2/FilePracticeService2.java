package edu.io.pack3.ex2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService2 {
    public void method1(String dirName, String fileName) {
        Path path = Path.of(dirName, fileName);


        if (path.getParent() != null) {
            if (!Files.exists(path.getParent())) {
                System.out.println("폴더 없음");
                return;
            }
            if (!Files.isDirectory(path.getParent())) {
                System.out.println("파일임");
                return;
            }
        }
        System.out.println("생성된 경로" + path.toAbsolutePath());
        if (!Files.exists(path)) {
            System.out.println("파일 없음");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (AccessDeniedException e) {
            System.out.println("접근 권한 없음");
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류");
        }
    }
}
