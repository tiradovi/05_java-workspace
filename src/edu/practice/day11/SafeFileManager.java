package edu.practice.day11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SafeFileManager {
    Scanner scanner = new Scanner(System.in);
    File file;

    public void method1() {
        Map<String, String> fileMap = new HashMap<>(); // 파일명 : 파일경로
        Map<String, Long> fileSizeMap = new HashMap<>(); // 파일명 : 파일크기
        BufferedReader br = null;

        // 초기 데이터
        fileMap.put("config", "config.txt");
        fileMap.put("log", "system.log");
        fileMap.put("data", "data.csv");

        // "config.txt" 파일을 읽어서 내용 출력
        // FileNotFoundException, IOException 처리
        // Map에서 파일 정보 조회 시 null 체크
        // finally에서 파일 스트림 닫기 및 "파일 관리 작업 완료" 메시지

        String fm = fileMap.get("config");

        // 파일 읽기
        try {
            br = new BufferedReader(new FileReader(fm));//파일 쓰기, 생성 등은 catch 필요
        } catch (FileNotFoundException e) {
            System.out.println("파일을 생성하시겠습니까? (yes/no)");

            if (scanner.nextLine().equals("yes")) {
                try {
                    new File(fm).createNewFile();
                    System.out.println("파일 생성 완료");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

}
