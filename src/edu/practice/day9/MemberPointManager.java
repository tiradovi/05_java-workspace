package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {
    Map<String, Integer> pointMap;

    public MemberPointManager() {
        pointMap = new HashMap<>();

        pointMap.put("user01", 1000);
        pointMap.put("user02", 1500);
        pointMap.put("user03", 500);
    }

    void registerMember(String memberId) {
        if (pointMap.containsKey(memberId)) {
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            pointMap.put(memberId, 0);
            System.out.println(memberId + "님이 신규 회원으로 등록되었습니다.");
        }
    }

    void earnPoints(String memberId, int point) {
        if (pointMap.containsKey(memberId)) {
            pointMap.put(memberId, pointMap.get(memberId) + point);
            System.out.println(memberId + "님에게 " + point + "가 적립되었습니다. 현재포인트:" + pointMap.get(memberId));
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    void usePoints(String memberId, int point) {
        if (pointMap.containsKey(memberId)) {
            if (pointMap.get(memberId) >= point) {
                pointMap.put(memberId, pointMap.get(memberId) - point);
                System.out.println(memberId + "님이 " + point + "포인트를 사용했습니다. 남은 포인트 :" + pointMap.get(memberId));
            } else {
                System.out.println("포인트가 부족합니다. 현재 포인트 :" + pointMap.get(memberId));
            }
        } else {
            System.out.println("존재하지 않는 회원ID입니다.");
        }
    }

    void displayAllMembers() {
        System.out.println("--- 전체 회원 포인트 정보 ---");
        for (Map.Entry<String, Integer> entry : pointMap.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " 포인트: " + entry.getValue());
        }
    }

}
