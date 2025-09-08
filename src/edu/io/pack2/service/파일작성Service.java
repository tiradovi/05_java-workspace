package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {
    /*
    Files.writeString(): Java11 부터 도입된 기능으로 간단히 문자열을 파일에 쓰는 방법
    파일 작성시 파일을 열고, 파일 내부에 글자를 작성한다 표시하고 try-catch를 이용해서 진행
    영어, 숫자 이외의 글자들 또한 인코딩 설정없이 알아서 처리
    
    자바 개발자들이 만든 class 파일
    File : 가장 처음에 만들어진 파일에 관련된 기능들이 작성되어있는 문서
            java.io
            
    Files : java 7 부터 도입된 문서
            파일 및 디렉터리를 처리 (생성, 복사, 이동, 쓰기, 읽기 등)을 더 편리하고 문제없이
            사용할 수 있도록 기능을 모아놓은 File의 상위호환
            .writeString() : java11에서 추가

    Path: 주소 경로에 대한 정보를 기능적으로 작성해놓은 인터페이스
    Paths: Path 기능을 활용해서 만든 문서 파일
           -> 이 두가지 없이도 Files.getPath()로 가져올 수 있지만
            책임분리 때문, File 문서는 파일처리, Paths문서는 경로 처리
     */
    public void method1() {
        String filename = "파일1.txt";
        String 파일내용 = "파일 1 내부에 글자 작성 예정";

        try {
            // 파일들 문서를 이용해서 문자열로 글자를 작성
            Files.writeString(Paths.get(filename), 파일내용);
            System.out.println(filename + "파일 저장 완료");
        } catch (IOException e) {
            System.out.println();
        }
    }

    public void method2() {
        String content = "안녕하세요. \n반갑습니다. \n오늘점심은 어떻게 되나요";
        String path = "files";
        String filename = "파일2.txt";
        File fPath = new File(path);
        File fFilename = new File(path + "/" + filename);
        if (!fPath.exists()) {
            fPath.mkdirs();
        }
        try {
            if (!fFilename.exists()) {
                fFilename.createNewFile();
                Files.writeString(Paths.get(fFilename.getPath()), content);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void method3() {
    }

    public void method4() {
    }
}
