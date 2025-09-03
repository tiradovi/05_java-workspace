package edu.practice.day8;


/**
 * Java 8일차 인터페이스, 다형성 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */
public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 8일차 인터페이스, 다형성 실습문제 실행 ===");


    }

    public void videoPlayer() {
        System.out.println("\n=== VideoPlayer ===");

        VideoPlayer youtube = new YouTube("자바 프로그래밍 강의");
        VideoPlayer tiktok = new TikTok("코딩마스터");

        System.out.println("--- YouTube ---");
        youtube.upload();
        youtube.play();
        youtube.pause();

        System.out.println("\n--- TikTok ---");
        tiktok.upload();
        tiktok.play();
        tiktok.pause();
    }

    public void socialMedia() {
        System.out.println("\n=== SocialMedia  ===");

        SocialMedia instagram = new Instagram("맛집 브런치");
        SocialMedia twitter = new Twitter("오늘 날씨가 정말 좋네요!");

        System.out.println("--- Instagram 테스트 ---");
        instagram.post();
        instagram.like();
        instagram.share();

        System.out.println("\n--- Twitter 테스트 ---");
        twitter.post();
        twitter.like();
        twitter.share();
    }

    public void onlineShopping() {
        System.out.println("\n=== OnlineShopping 인터페이스 테스트 ===");

        OnlineShopping amazon = new Amazon("프로그래밍 책");
        OnlineShopping coupang = new Coupang("무선 마우스");

        System.out.println("--- Amazon 테스트 ---");
        amazon.browse();
        amazon.addToCart();
        amazon.purchase();

        System.out.println("\n--- Coupang 테스트 ---");
        coupang.browse();
        coupang.addToCart();
        coupang.purchase();
    }

    public void messenger() {
        System.out.println("\n=== Messenger ===");

        Messenger kakao = new KakaoTalk("친구1");
        Messenger discord = new Discord("개발자방");

        System.out.println("--- KakaoTalk 테스트 ---");
        kakao.sendMessage();
        kakao.receiveMessage();
        kakao.makeCall();

        System.out.println("\n--- Discord 테스트 ---");
        discord.sendMessage();
        discord.receiveMessage();
        discord.makeCall();
    }

    public void streamingService() {
        System.out.println("\n=== StreamingService  ===");

        StreamingService netflix = new Netflix("스트레인저 씽즈");
        StreamingService disney = new Disney("토이 스토리");

        System.out.println("--- Netflix 테스트 ---");
        netflix.login();
        netflix.watch();
        netflix.logout();

        System.out.println("\n--- Disney+ 테스트 ---");
        disney.login();
        disney.watch();
        disney.logout();
    }


    public void digitalLife() {
        System.out.println("\n=== 디지털 라이프 시뮬레이션 ===");

        System.out.println("🌐 디지털 라이프 시작! 🌐\n");

        // 아침: 유튜브로 하루 시작
        System.out.println("🌅 === 아침 루틴 ===");
        VideoPlayer youtube = new YouTube("아침 요가 영상");
        youtube.upload();
        youtube.play();
        System.out.println();

        // 점심: 인스타그램에 점심 사진 업로드
        System.out.println("🍽️ === 점심시간 ===");
        SocialMedia instagram = new Instagram("맛있는 파스타");
        instagram.post();
        instagram.like();
        System.out.println();

        // 오후: 온라인 쇼핑
        System.out.println("🛍️ === 쇼핑 타임 ===");
        OnlineShopping coupang = new Coupang("무선 이어폰");
        coupang.browse();
        coupang.addToCart();
        coupang.purchase();
        System.out.println();

        // 저녁: 친구와 카톡
        System.out.println("💬 === 저녁 대화 ===");
        Messenger kakao = new KakaoTalk("베스트프렌드");
        kakao.sendMessage();
        kakao.receiveMessage();
        System.out.println();

        // 밤: 넷플릭스로 하루 마무리
        System.out.println("🌙 === 밤 휴식시간 ===");
        StreamingService netflix = new Netflix("오징어 게임");
        netflix.login();
        netflix.watch();

        System.out.println("\n🌐 디지털 라이프 완료! 내일 또 만나요! 🌐");
    }

    public static void servicesTogether() {
        System.out.println("\n=== 모든 서비스 ===");

        // 사용자가 하루 동안 이용하는 모든 디지털 서비스
        System.out.println("📱 현대인의 하루 디지털 서비스 이용 패턴");

        VideoPlayer[] videos = {new YouTube("모닝 뉴스"), new TikTok("댄스챌린지")};
        SocialMedia[] socials = {new Instagram("오늘의 OOTD"), new Twitter("좋은 생각 공유")};
        OnlineShopping[] shopping = {new Amazon("책"), new Coupang("생필품")};
        Messenger[] messengers = {new KakaoTalk("가족"), new Discord("친구들")};
        StreamingService[] streaming = {new Netflix("드라마"), new Disney("애니메이션")};

        System.out.println("\n=== 모든 동영상 서비스 이용 ===");
        for (VideoPlayer video : videos) {
            video.upload();
            video.play();
            video.pause();
            System.out.println();
        }

        System.out.println("=== 모든 소셜미디어 서비스 이용 ===");
        for (SocialMedia social : socials) {
            social.post();
            social.like();
            social.share();
            System.out.println();
        }

        System.out.println("=== 모든 쇼핑 서비스 이용 ===");
        for (OnlineShopping shop : shopping) {
            shop.browse();
            shop.addToCart();
            shop.purchase();
            System.out.println();
        }

        System.out.println("=== 모든 메신저 서비스 이용 ===");
        for (Messenger msg : messengers) {
            msg.sendMessage();
            msg.receiveMessage();
            msg.makeCall();
            System.out.println();
        }

        System.out.println("=== 모든 스트리밍 서비스 이용 ===");
        for (StreamingService stream : streaming) {
            stream.login();
            stream.watch();
            stream.logout();
            System.out.println();
        }
    }
}
