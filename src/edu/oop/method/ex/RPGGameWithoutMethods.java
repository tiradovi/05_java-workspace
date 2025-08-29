package edu.oop.method.ex;

public class RPGGameWithoutMethods {
    public static void main(String[] args) {
        // 전사 캐릭터 처리
        String warrior = "용감한 전사";
        int warriorLevel = 15;
        int warriorStr = 80;
        int warriorDef = 60;
        int warriorMagic = 20;

        // 전사 총 스탯 계산
        int warriorTotal = warriorStr + warriorDef + warriorMagic;

        // 전사 전투력 계산
        int warriorPower = powerCal(warriorStr, warriorDef, warriorMagic);

        // 전사 등급 계산
        String warriorRank = rankCal(warriorPower);

        // 전사 정보 출력
        displayInfo(warrior, warriorLevel, warriorStr, warriorDef, warriorMagic, warriorTotal, warriorPower, warriorRank);


        // 마법사 캐릭터 처리 (완전히 동일한 로직)
        String mage = "현명한 마법사";
        int mageLevel = 12;
        int mageStr = 30;
        int mageDef = 40;
        int mageMagic = 95;

        // 마법사 총 스탯 계산
        int mageTotal = mageStr + mageDef + mageMagic;

        // 마법사 전투력 계산 (동일한 공식)
        int magePower = powerCal(mageStr, mageDef, mageMagic);

        // 마법사 등급 계산
        String mageRank = rankCal(magePower);

        // 마법사 정보 출력
        displayInfo(mage, mageLevel, mageStr, mageDef, mageMagic, mageTotal, magePower, mageRank);


        // 도적 캐릭터 처리 (또 다시 중복)
        String thief = "민첩한 도적";
        int thiefLevel = 18;
        int thiefStr = 55;
        int thiefDef = 45;
        int thiefMagic = 35;

        // 도적 총 스탯 계산
        int thiefTotal = thiefStr + thiefDef + thiefMagic;

        // 도적 전투력 계산
        int thiefPower = powerCal(thiefStr, thiefDef, thiefMagic);

        // 도적 등급 계산
        String thiefRank = rankCal(thiefPower);

        // 도적 정보 출력 (
        displayInfo(thief, thiefLevel, thiefStr, thiefDef, thiefMagic, thiefTotal, thiefPower, thiefRank);


        // 파티 전체 정보
        System.out.println("🎮 파티 정보 🎮");
        System.out.println("파티원 수: 3명");
        System.out.println("평균 레벨: " + (warriorLevel + mageLevel + thiefLevel) / 3);
        System.out.println("총 전투력: " + (warriorPower + magePower + thiefPower));

        // 최강 캐릭터 찾기
        if (warriorPower >= magePower && warriorPower >= thiefPower) {
            System.out.println("최강 캐릭터: " + warrior + " (전투력: " + warriorPower + ")");
        } else if (magePower >= warriorPower && magePower >= thiefPower) {
            System.out.println("최강 캐릭터: " + mage + " (전투력: " + magePower + ")");
        } else {
            System.out.println("최강 캐릭터: " + thief + " (전투력: " + thiefPower + ")");
        }
    }

    public static int powerCal(int str, int def, int magic) {
        return (str * 2) + def + (magic / 2);
    }

    public static String rankCal(int power) {
        if (power >= 200) {
            return "전설급";
        } else if (power >= 150) {
            return "영웅급";
        } else if (power >= 100) {
            return "고수급";
        } else {
            return "초보급";
        }
    }

    public static void displayInfo(String className, int level, int str, int def, int magic, int total, int power, String rank) {
        System.out.println("🔮 " + className + " (레벨 " + level + ")");
        System.out.println("힘: " + str + " | 방어: " + def + " | 마법: " + magic);
        System.out.println("총 스탯: " + total + " | 전투력: " + power);
        System.out.println("등급: " + rank);
        System.out.println();
    }
}