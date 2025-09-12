package edu.practice.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day14Practice {

    public void saveMemo() {
        Path memoDir = Path.of("memo");
        Path memoFile = Path.of("memo", "my_memo.txt");
        String content = "오늘은 Java 파일 처리를 배우는 날!\n화이팅!";
        try {
            Files.createDirectories(memoDir);
            Files.writeString(memoFile, content);
            System.out.println("메모가 저장되었습니다 : " + memoFile.getFileName());
            System.out.println("저장된 내용 : " + Files.readString(memoFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeDiary() {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path diaryDir = Path.of("diary");
        Path diaryFile = Path.of("diary", today + "_일기.txt");
        String content = today + " 일기\n오늘 배운 것: Java 파일 입출력\n기분: 좋음!";

        try {
            Files.createDirectories(diaryDir);
            Files.writeString(diaryFile, content);
            System.out.println("오늘 일기가 작성되었습니다: " + diaryFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recordVisitor() {
        Path logDir = Path.of("visitors");
        Path logFile = Path.of("visitors", "visitor_log.txt");
        String timestamp = getCurrentTime();
        String visitInfo = timestamp + " - 새로운 방문자가 들어왔습니다.\n";

        try {

            Files.createDirectories(logDir);
            Files.writeString(logFile, visitInfo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("방문자 기록이 추가되었습니다.");
            System.out.println("=== 전체 방문자 기록 ===");
            System.out.println(Files.readString(logFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void createConfig() {
        Path configDir = Path.of("config");
        Path configFile = Path.of("config", "app_config.txt");
        String config = "=== 앱 설정 파일 ===\n버전: 1.0\n언어: 한국어\n테마: 기본\n생성일: " + getCurrentTime();

        try {
            Files.createDirectories(configDir);
            Files.writeString(configFile, config, StandardOpenOption.CREATE);
            if (!Files.exists(configFile)) {
                System.out.println("새로운 설정 파일을 생성합니다.");
            } else {
                System.out.println("기존 설정 파일을 업데이트합니다.");
            }
            System.out.println("설정 파일이 생성되었습니다:" + configFile.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
