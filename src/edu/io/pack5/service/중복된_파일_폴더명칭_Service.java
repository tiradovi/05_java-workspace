package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class 중복된_파일_폴더명칭_Service {
    public void saveImage1() {
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;

        do {
            String newName = baseName + "_" + count + extName;
            path = Path.of("profiles", "member01", newName);
            count++;
        } while (Files.exists(path));

        try {
            Files.createDirectories(path.getParent());
            String imgUrl = "https://i.namu.wiki/i/f5sB1VmqFMrhyfDBazayQ_Gv3sJR4UqLucxfEzvSYMWiqdBVOdf1rzdMR4n-HDyDCj7YXbwJrTImpHslTa5u4w.webp";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            System.out.println("파일 생성 오류");
        }
    }
}
