package edu.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FileEx {
    /*
    FileInputStream  : 컴퓨터에 존재하는 파일 확인 클래스
    FileOutputStream : 파일 저장 클래스
    BufferedReader   : 파일에 글 작성하거나 읽을 수 있도록 도우는 클래스
    
    파일 읽기 관련
    FileInputStream  : 파일의 바이트 데이터를 읽어오는 클래스
    FileReader       : 파일의 텍스트 데이터를 문자 단위로 읽는 클래스
    BufferedReader   : 파일의 텍스트를 버퍼에 담아 효율적으로 읽는 클래스
    Scanner          : 파일의 데이터를 다양한 형태로 파싱하여 읽는 클래스
    
    파일 쓰기 관련
    FileOutputStream : 파일의 바이트 데이터를 저장하는 클래스
    FileWriter       : 파일의 텍스트 데이터를 문자 단위로 저장하는 클래스
    BufferedWriter   : 파일에 텍스트를 버퍼에 담아 효율적으로 저장하는 클래스
    PrintWriter      : 파일에 다양한 형태의 데이터를 편리하게 저장하는 클래스
    
    파일 정보 및 관리
    File             : 파일이나 폴더의 존재 여부, 정보 확인하는 레거시 클래스
    Files            : 파일 생성, 삭제, 복사 등 모든 파일 작업을 담당하는 유틸리티 클래스
    Path             : 파일 경로를 나타내고 조작하는 현대적 클래스
    Paths            : Path 객체를 생성하는 팩토리 클래스
    
    레거시           : 구식
    팩토리           : 인터페이스를 활용하여 클래스 형태로 만들고 만들어진 클래스를 객체 형태로 사용
    유틸리티         : 편리한 기능을 모아놓은 클래스
    
    
     */

    /**
     * 레거시 클래스 비교하기
     * 기존코드와 호환성 때문에 사용 새프로젝트에서는 잘 사용하지 않음
     */
    public void legacyMethod() {
        // 레거시 방식 - 오래되고 불편함
        File file = new File("폴더경로/파일이름.확장자명");
        boolean exists1 = file.exists(); // 예외처리 없이 true/false만 진행
        boolean success = file.delete();
        if (!success) {
            // 삭제 이유 없음
            System.out.println("삭제 실패");
        }

        // 기타 문제들
        // File 클래스 느림
        // 시스템에서 직접적으로 Call 하므로 위험성 높음
        // copy() move() realAllText() 파일복사 파일이동 파일내모든텍스트읽기기능 없음

        // 현대적 방식 - 새롭고 편함
        Path path = Path.of("폴더경로/파일이름.확장자명");
        boolean exists2 = Files.exists(path); // 더 안전하고 상세기능이 많음
        try {
            Files.delete(path);
        } catch (NoSuchFileException e) {
            System.out.println("파일이 없습니다.");
        } catch (AccessDeniedException e) {
            System.out.println("권한이 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 연결문제 오류");
        } catch (Exception e) {
            System.out.println("개발자가 알지 못하는 문제 발생");
        }
    }

    /**
     * 팩토리 패턴
     */
    public void factoryMethod() {
        // 레거시 버전 Windows와 Mac, Linux 별로 /를 쓰거나 \\사용해서
        // 환경을 구분하기에 좋은 방식이 아님
        File file1 = new File("폴더경로/파일이름.확장자명");
        File file2 = new File("폴더경로", "/파일이름.확장자명");

        // 현대 버전 Windows와 Mac, Linux 을 자바 코드에서 운영체제를 읽고
        // "," 사이를 알아서 읽고 변환
        // Paths 팩토리의 경우
        Path path1 = Paths.get("file.txt");  //파일만 사용
        Path path2 = Paths.get("C", "폴더이름", "file.txt");// 최상위, 중간, 파일

        // Java 11 버전부터 사용되는 최신 방법
        // Paths와 Path 구분하지 못한채 사용하는 경우가 많아 Path라는 명칭으로 통일
        // 폴더이름 파일이름.확장자명의 경로를 사용할 수 있도록 설정된 기능
        Path path3 = Path.of("file.txt");

        // 절대경로
        Path 절대경로1 = Path.of("C:", "Users", "user", "Desktop", "file.txt");
        Path 절대경로2 = Path.of("/", "home", "user", "Desktop", "file.txt");

        // 상대경로
        Path 상대경로1 = Path.of("file.txt"); // 현재 폴더에서 file.txt
        Path 상대경로2 = Path.of("src", "file.txt"); // 현재폴더 src 아래에 file.txt
        Path 상대경로3 = Path.of("..", "file.txt"); // 현재폴더 상위폴더의 file.txt
        Path 상대경로4 = Path.of(".", "path1", "file.txt"); // 현재폴더에서 path1폴더의 file.txt


    }

    /**
     * 유틸리티 클래스 및 메서드 기능
     */
    public void utilityMethod() {
        // 클래스 기반 유틸리티
        try {
            //File 에는 존재하지 않지만 Files에는 존재하는 기능들
            Files.copy(Path.of("원본"), Path.of("사본"));
            Files.move(Path.of("원본"), Path.of("사본"));
            Files.delete(Path.of("사본"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 메서드 유틸리티
    double result1 = Math.max(10, 20);
    double result2 = Math.sqrt(10);
    double result3 = Math.random();


    // 정렬 뒤집기
    ArrayList list = new ArrayList<>();
/*    Collections.sort(list);
    Collections.reverse(list);
    */

    /*

       Paths.get()   : 1개 이상의 문자열 작성
                        , 를 이용하여 여러 경로 요소를 조합 가능
                      Java11 버전부터는 Path.of() 사용 권장
       Path.of()    : 1개 이상의 문자열 작성
                      더 간결한 문법 사용
       Path.getParent() = C://파일경로1번/파일경로2번/파일경로3번
                          파일이름.txt 전 모~든 경로를 가져오는 기능
       Path.getFileName() = 파일경로 이외에 [파일명칭.확장자이름] 만 가지고 오는 기능

       Path.toAbsolutePath() = 절대 경로 반환

       Path.getNameCount()  = 파일위치에 도달하기 까지 몇개의 / 를 거치는가? 경로 갯수 세는것
       int nameCount    = path.getNameCount(); //파일이름 전까지 슬래시 개수로 폴더 개수 가져옴
       Path.getName(1) : index 상 파일경로1번 들어옴
       Path.getName(0) : index 상     C:     들어옴



       Files 클래스 주요 메서드
       파일 복사 / 이동 / 삭제
       Files.copy(Path.of("원본파일경로/원본파일이름.확장자이름"),Path.of("복사해놓을파일경로/복사본파일이름.확장자이름"));
       Files.copy(Path.of("원본파일경로/원본파일이름.확장자이름"),Path.of("복사해놓을파일경로/복사본파일이름.확장자이름"), StandardCopyOption.REPLACE_EXISTING);

       Files.move(Path.of("원본파일경로/원본파일이름.확장자이름"),Path.of("이동해놓을파일경로/(선택적으로변경)파일이름.확장자이름"));
       Files.move(Path.of("원본파일경로/원본파일이름.확장자이름"),Path.of("이동해놓을파일경로/(선택적으로변경)파일이름.확장자이름"), StandardCopyOption.REPLACE_EXISTING);
                                                                                                                 파일이동할 때 덮어쓰기 형태로 파일이동

       Files.delete(Path.of("경로/파일이름.확장자이름"));          -> 파일삭제하는데 삭제 못하면 예외 발생
       Files.deleteIfExists(Path.of("경로/파일이름.확장자이름"));  -> 파일삭제하는데 존재하지 않아도 예외 발생하지 않음
                                                                     파일이 존재하는데 다른 곳에서 파일을 사용중일 경우에는 예외 발생

       Path path = Path.of("C://파일경로1번/파일경로2번/파일경로3번/파일이름.txt");

       Files.createDirectories(path.getParent());
            .createDirectories()                    -> 파일이름.txt 전 에 존재하는 모든 파일 경로가 없으면 생성


       Streaming = 네트워크를 통해 데이터를 특히 오디오나 비디오 같은 미디어를 실시간으로 받아오는 기법
                        전송하고 재생하는 방식

       Stream     = 데이터의 연속적인 흐름을 나타내는 개념
                    파일, 네트워크, 메모리 등에서 데이터를 순차적으로 읽고 쓸 때 사용

      Streamer = 인터넷을 통해 데이터의 연속적인 흐름을이용해서 영상/음성 데이터를 실시간으로 흘려 보내는 사람

      Viewer   = 스트리머의 방송을 보는 사람들

      시청자가 스트리머의 방송을 보던 중 갑자기 화면이 정지되더니 버퍼링 중입니다 !!!!!

      버퍼링 중입니다 = 데이터를 가져오는 중입니다.

      Buffer : 데이터를 임시로 저장하는 메모리 영역
        파일에서는 BufferedReader / BufferedWriter 로 파일읽기 쓰기를 구현


     */
}
