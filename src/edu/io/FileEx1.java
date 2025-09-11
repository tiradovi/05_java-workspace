package edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEx1 {

    /**
     * 과거의 파일 명칭메소드
     */
    public void 고전방식() {
        String originName = "사용자가 저장한 사진이름.png";

        Path path = Path.of("회사에서 업로드할 파일 위치", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);


        while (Files.exists(path)) {
            String newName = baseName + "_" + System.currentTimeMillis() + extName;
            path = Path.of("회사에서 업로드할 파일 위치", newName);

        }

        try {
            Files.createDirectories(path.getParent());
            String imgUrl = "https://i.namu.wiki/i/f5sB1VmqFMrhyfDBazayQ_Gv3sJR4UqLucxfEzvSYMWiqdBVOdf1rzdMR4n-HDyDCj7YXbwJrTImpHslTa5u4w.webp";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close();
        } catch (IOException e) {
            System.out.println("파일 생성 오류");
        }
    }
    // 예전에는 사용자가 컴퓨터나 핸드폰, 디바이스 기기에 저장한 명칭을 활용하여
    // 회사 내부에 파일 저장[사용자사진1, 2 or 사용자사진_현재시간]
    // 코드가 너무 길어지고 관리어려움
    // 회사에 맞게 조정하는 신방식이 생김

    public void 회사에서사진저장하는기능(String imgUrl) {
        String 회사에서사용할기본Name = "회사이름_" + System.currentTimeMillis() + ".jpg";

        Path path = Path.of("C:", "회사이름", 회사에서사용할기본Name);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            Files.copy(url.openStream(), path);
            // InputStream in =url.openStream() 도 가능하지만 한번 사용하는 경우 위와같이 줄임
            System.out.println("파일 생성 완료");
        } catch (IOException e) {
            System.out.println("파일 생성 오류");
        }
    }

    /**********************
     *  InputStream 변천사
     ***********************/
    public void defaultInputStream() {
        try {
            Path path = Path.of("폴더위치/파일이름.확장자이름");
            URL url = new URL("이미지주소");
            InputStream inputStream = url.openStream();
            // 한번에 데이터를 가져올 수 있는 최대 공간 크기
            byte[] buffer = new byte[1024];  // 1024바이트
            FileOutputStream outputStream = new FileOutputStream(path.toFile());

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            outputStream.close();
            inputStream.close();

        } catch (MalformedURLException e) {
            System.out.println("InputStream에서 데이터 가져오도록 하는 도중 생긴문제");
        } catch (IOException e) {
            System.out.println("IO 오류");
        }
    }

    public void 경로결합() {
        Path dir = Path.of("폴더1/폴더2");

        Path file = dir.resolve("파일이름.txt");
        // resolve() : 기존 경로와 새로운 경로나 파일을 결합하는 기능
        // file 에는 폴더1/폴더2/파일이름.txt로 결합해서 사용

    }

}
