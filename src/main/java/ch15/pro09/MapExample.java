package ch15.pro09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
    public static void main(String[] args){;
        Map<String, Integer> map = new HashMap<>();
        map.put("Kim", 85);
        map.put("Park", 90);
        map.put("Lee", 75);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            int tempScore = entry.getValue();
            String tempName = entry.getKey();
            if (tempScore > maxScore) {
                maxScore = tempScore;
                name = tempName;
            }
            totalScore += tempScore;
        }

        double average = (double)totalScore / entrySet.size();
        System.out.println("최고 점수를 받은 사람 : " + name + ", 점수 : " + maxScore);
        System.out.println("평균 점수 : " + average);

    }
}
