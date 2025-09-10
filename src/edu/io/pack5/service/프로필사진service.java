package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

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

            Files.copy(inputStream, picture1);
            inputStream.close();

            System.out.println("사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("사진 저장 중 문제 발생시 문제 해결");
        }
    }

    public void saveImg3(String imgName) {
        Path memberFolder = Path.of("profiles", "member07");

        try {
            String imgurl = "https://i.namu.wiki/i/UHPnPScHCBrY70JhvMyqExeI5PzTzpO4tEwHs4He52FR4ZmWnPy-8etpgfbDD5-9GvTAytzTqqjGkc-V6apmQw.webp";

            Files.createDirectories(memberFolder);
            Path picture1 = Path.of("profiles", "member07", imgName);
            URL url = new URL(imgurl);
            InputStream inputStream = url.openStream();
            // 이미지를 복사해서 저장한다는 의미를 쓰는 이유
            // 웹에 있는 이미지를 그대로 복제하여 내 컴퓨터 안에 저장하는 것이기 때문
            // 복제해도 웹의 이미지는 사라지지않음
            // .copy() : 똑같은 이름의 이미지가 존재할 때 덮어쓰기 안됨
            // 
            Files.copy(inputStream, picture1);
            inputStream.close();

            System.out.println("사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("사진 저장 중 문제 발생시 문제 해결");
        }
    }

    // Scanner를 이용하여 폴더 이름, 이미지이름 전달받고 폴더안에 이미지 저장
    /*
    png = 투명도를 지원하는 비손실 압축(로고, 아이콘, 투명배경) 이 필요한 이미지 사용
         파일 크기 큼, 여러번 수정시 사용
    
    jpg = 투명도를 지원하지 않는 손실 압축 (사진, 그라데이션, 배너 등) 완성된 사진
          압축하여 데이터 크기를 줄여 사용할 때 용이
          
    svg = 확장 가능한 이미지, 이미지를 아무리 확대하거나 축소해도 깨지지 않는 디지털 이미지
          수학 공식으로 이미지 설계, 디바에스에서 유용하게 사용
     */
    public void saveImg4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("폴더 이름 : ");
        String folderName = sc.nextLine();
        System.out.print("이미지 이름 : ");
        String imgName = sc.nextLine();

        Path Folder = Path.of(folderName);

        try {
            String imgurl = "https://i.namu.wiki/i/4yy2nO9Z2bPrQ8xuQGiffmHH9NVNn-i7Qldvmi-2NrkHSUQqIxtzPAfHU3BhU4UlLyVrF1k0HaAJT20zFZgs0w.webp";

            Files.createDirectories(Folder);
            Path picture = Path.of(folderName, imgName + ".png");
            URL url = new URL(imgurl);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, picture);
            inputStream.close();

            System.out.println("사진 개별 폴더로 저장 완료");
        } catch (IOException e) {
            System.out.println("사진 저장 중 문제 발생시 문제 해결");
        }

    }

    public void saveImg5() {
        Scanner sc = new Scanner(System.in);
        // 외부 url을 통해 이미지를 가져올 때 자바에서 접근할 수 없는 주소도 존재
        // 사이트마다 다름
        // 실패 : https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Oryctolagus_cuniculus_Tasmania_2.jpg/960px-Oryctolagus_cuniculus_Tasmania_2.jpg
        // 성공 : https://i.namu.wiki/i/vVnWIpQbXrM6iACbKNo8Bs-s7yFMOgyF2wIBCMWsjeix_3f03io5B9Rm1H8LU5Hmkomv9HOhNMHORqp4YRyL-g.webp
        System.out.print("주소 이름 : ");
        String imgurl = sc.nextLine();
        System.out.print("폴더 이름 : ");
        String folderName = sc.nextLine();
        System.out.print("이미지 이름 : ");
        String imgName = sc.nextLine();

        Path Folder = Path.of(folderName);

        try {
            Files.createDirectories(Folder);
            Path picture = Path.of(folderName, imgName + ".png");
            URL url = new URL(imgurl);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, picture);
            inputStream.close();

            System.out.println("이미지 저장 완료");
        } catch (IOException e) {
            System.out.println("이미지 저장 중 문제 발생");
            if (e.getMessage().contains("403")) {
                System.out.println("403 오류");
            }
        }

    }
}
