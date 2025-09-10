package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class 중복된_파일_폴더명칭_Service {
    /**
     * do-while을 이용하여 파일이름_숫자.png 완성
     */
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

    /**
     * while을 이용하여 파일이름_숫자.png 완성
     */
    public void saveImage2() {
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;

        while (Files.exists(path)) {
            String newName = baseName + "_" + count + extName;
            path = Path.of("profiles", "member01", newName);
            count++;
        }

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

    /**
     * 현재시간을 이용해서 현재시간으로 명칭 완성
     * System.currentTimeMillis(): 1970년 1월 1일 00:00:00 부터 현재까지의 밀리초
     * 0.001초로 매우 정밀, 동일하기 힘듦
     * 동시에 저장해도 데이터 저장이 순차적으로 이루어져 겹칠 일이 없음
     */
    public void saveImage3() {
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);


        while (Files.exists(path)) {
            String newName = baseName + "_" + System.currentTimeMillis() + extName;
            path = Path.of("profiles", "member01", newName);

        }

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

    public void saveImage4() {
        String originName = "사진.png";

        Path path = Path.of("폴더1", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;
        while (Files.exists(path)) {
            String newName = baseName + "_" + count + extName;
            path = Path.of("폴더1", newName);
            count++;
        }
        String imgUrl = "https://i.namu.wiki/i/f5sB1VmqFMrhyfDBazayQ_Gv3sJR4UqLucxfEzvSYMWiqdBVOdf1rzdMR4n-HDyDCj7YXbwJrTImpHslTa5u4w.webp";
        try {

            Files.createDirectories(path.getParent());

            URL url = new URL(imgUrl);

            InputStream in = url.openStream();

            Files.copy(in, path);

            in.close();

        } catch (IOException e) {
            System.out.println("파일 생성 오류");
        }
    }

    public void saveImage5() {
        String imgUrl = "https://i.namu.wiki/i/vuwL4GK_wMr-1pA68Iahm_IEmjNpVt0XDEUGJcp72Vxmrv1_pVyfE1494WE3K6TaZeZpgR_hG8WoRb2JVdZflg.webp";
        // data:image/jpeg;base64 = 데이터 숫자 자체값이어수 주소로 읽을 수 없음
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);
        int 마침표위치 = originName.lastIndexOf('.');
        String 기본이름 = originName.substring(0, 마침표위치);
        String 확장자이름 = originName.substring(마침표위치);

        int 숫자 = 1;

        try {
            while (Files.exists(path)) {
                String 새로운이름 = 기본이름 + "(" + 숫자 + ")" + 확장자이름;
                path = Path.of("profiles", "member01", 새로운이름);
                숫자++;
            }
            Files.createDirectories(path.getParent());
            URL 이미지주소 = new URL(imgUrl);
            InputStream 사진가지고오기 = 이미지주소.openStream();
            Files.copy(사진가지고오기, path);
            System.out.println(path + ": path");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
