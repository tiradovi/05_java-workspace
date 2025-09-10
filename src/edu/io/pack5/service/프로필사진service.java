package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 프로필사진service {

    // 매개변수로 프로필사진.txt저장
    public void createProfileFolder(String profiles, String files) throws IOException {
        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", profiles);
        //  Path memberFolder2 = Path.of("profiles", "member02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            //   Files.createDirectories(memberFolder2);

            // 3. 폴더 내에 프로필 사진 저장하기
            Path picture1 = Path.of("profiles", profiles, files);
            //    Path picture2 = Path.of("profiles", "member02", "프로필사진02.txt");

            Files.writeString(picture1, "프로필 사진 이미지입니다.");
            //    Files.writeString(picture2, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생시 문제 해결");
            // 1. 메인 서버가 끊기면 2번째 후보 서버로 저장시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게 하고 알림
        }
    }

    //이미지 주소로 이미지 저장
    public void saveImg(String imgurl) {
        //String imgurl = "https://www.fitpetmall.com/wp-content/uploads/2023/10/GettyImages-492548888-1.png";

        Path memberFolder = Path.of("profiles", "member06");

        try {
            Files.createDirectories(memberFolder);
            Path picture1 = Path.of("profiles", "member06", "사진1.png");

            // 4. 이미지 주소에서 이미지 다운로드 처리
            System.out.println("이미지 다운로드 중");
            // Url = 클라이언트가 작성한 이미지 주소를 java에서 읽거나 쓰거나 사용하도록 설정하는 문서
            URL url = new URL(imgurl);
            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬 
            // url.openStream = 이미지주소에서 데이터가 들어오도록 통로 열기
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            // 인터넷에 존재하는 이미지를 내 컴퓨터에 복제                     선택사항      기존에 이미지이름이 존재하면 덮어쓰기 형태로 이미지이름에 현재 저장하는 이미지 데이터를 설정
            Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
            // 데이터를 모두 가져오고, 가져온 데이터를 복사해서 내 컴퓨터에 저장이 완료되면,
            // 데이터가 들어올 수 있는 통로 닫아두기 설정을 해주어야 저장이 완료됨

            System.out.println("프로필 사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생시 문제 해결");
        }
    }

    public void saveImg2(String imgurl) {
        Path memberFolder = Path.of("profiles", "member07");

        try {
            Files.createDirectories(memberFolder);
            Path picture1 = Path.of("profiles", "member07", "사진2.png");
            URL url = new URL(imgurl);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();

            System.out.println("사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("사진 저장 중 문제 발생시 문제 해결");
        }
    }
}
