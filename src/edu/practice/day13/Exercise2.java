package edu.practice.day13;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise2 {
    public void solution1() {
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름: 홍길동\n나이: 25\n전공: 컴퓨터공학\n학년: 3학년\n";
        try {
            Files.createDirectories(studentDir);
            Files.writeString(filePath, content);
            System.out.println("학생 정보 파일이 생성되었습니다.");
            System.out.println("=== 파일 내용 ===");
            String line = Files.readString(filePath);
            // readString 은 읽는 용도가 맞으나 출력하지 않으므로 sout으로 출력
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution2() {
        Path textDir = Path.of("downloads", "text", "downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";
        try {
            Files.createDirectories(textDir.getParent());
            URL url = new URL(textUrl);
            Files.copy(url.openStream(), textDir, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("텍스트 다운로드 완료: " + textDir);
            System.out.println("다운로드된 내용 : " + Files.readString(textDir));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution3() {
        String originalName = "document.txt";
        Path backupDir = Path.of("backup", originalName);
        int dot = originalName.lastIndexOf('.');
        String baseName = originalName.substring(0, dot);
        String extension = originalName.substring(dot);
        String content = "이것은 백업 문서입니다.";
        int counter = 1;

        try {
            Files.createDirectories(backupDir.getParent());

            while (Files.exists(backupDir)) {
                String newName = baseName + "_" + counter + extension;
                backupDir = Path.of("backup", newName);

                // 추후 문제가 생겼을 경우 실행할 작업은 맨 아래에 작성
                counter++;
            }
            Files.write(backupDir, content.getBytes());
            System.out.println("파일이 저장되었습니다: " + backupDir.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void solution4() {
        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");

        try {
            Files.createDirectories(tempDir);
            Files.writeString(sourceFile, "중요한 데이터 파일");
            System.out.println("1단계: 임시 파일 생성 완료 - " + sourceFile);

            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계: 폴더 생성 완료 - " + archiveDir + ", " + backupDir);

            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계: 파일 이동 완료 - " + sourceFile + "->" + targetFile);

            Files.copy(targetFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계: 백업 복사 완료 - " + backupFile);

            System.out.println("모든 작업이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void solution5() {
        Path logsDir = Path.of("logs");
        Scanner scanner = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        String fileName = "log_" + timestamp + ".txt";
        int logCount = 0;

        System.out.println("로그 메시지를 입력하세요 ('종료'를 입력하면 저장됩니다):");
        try {
            Files.createDirectories(logsDir);
            while (true) {
                System.out.print("> ");
                String log = scanner.nextLine();
                if (log.equals("종료")) {
                    break;
                }
                logCount++;
                content.append(log);
                content.append("\n");
                Files.writeString(logsDir.resolve(fileName), content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("로그 파일이 저장되었습니다: " + logsDir.resolve(fileName));
        System.out.println("총 " + logCount + "개의 로그가 저장되었습니다.");
    }

    public void solution6() {

    }
}
