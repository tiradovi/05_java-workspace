package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 이미지URL서비스 {
    public void dirSaveImg(String imgUrl, String imgDir, String imgName) {
        Path path = Path.of(imgDir, imgName);
        try {
            // 파일 이름 중복 처리
            // url : https://i.namu.wiki/i/kTprfHSbOuugAoUlZ9cL3uvTm26MA2gDvusM4-mvBWMYOHI68Q861xSAFDCOVMzcW0iIxrAR6iN00R_yk3KdbQ.webp
            // path : mutal / 뮤탈.png
            // path.getParent() : mutal , 하위명칭 이외 폴더들을 가져오기
            // path.getFileName() : 뮤탈.png , 마지막에 존재하는 이름 가져오기
            String name = path.getFileName().toString();
            System.out.println("name : " + name);

            int dot = name.lastIndexOf('.'); // .을 기준으로 앞에 있는 글자만 가져오겠다.
            String baseName = name.substring(0, dot); // .이전 파일 명칭
            String extName = name.substring(dot); // .png 확장자 명칭
            System.out.println("baseName : " + baseName);
            System.out.println("extName : " + extName);

            Files.createDirectories(path.getParent());

            int count = 1;
            do {
                String newName = baseName + "_" + count + extName;
                path = Path.of(imgDir, newName);
                count++;
            } while (Files.exists(path));
            System.out.println(count);
            URL url = new URL(imgUrl);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, path);
            inputStream.close();

            System.out.println("이미지 저장 완료");
        } catch (FileAlreadyExistsException e) {
            System.out.println("파일 중복");
        } catch (IOException e) {
            System.out.println("이미지 저장 중 문제 발생");
            if (e.getMessage().contains("403")) {
                System.out.println("403 오류");
            }
        }

    }
}
