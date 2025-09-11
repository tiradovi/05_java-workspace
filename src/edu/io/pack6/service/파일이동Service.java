package edu.io.pack6.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 파일이동Service {
    public void moveFile1() {
        Path 기존파일위치 = Path.of("profiles", "member01", "사진.png");
        Path 이동할파일위치 = Path.of("profiles", "member02", "사진.png");

        try {
            Files.createDirectories(이동할파일위치.getParent());
            Files.move(기존파일위치, 이동할파일위치);

            System.out.println(기존파일위치 + "->" + 이동할파일위치);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
