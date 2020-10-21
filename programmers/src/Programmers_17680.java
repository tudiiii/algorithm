/*
[1차] 캐시
테스트 1 〉	통과 (0.13ms, 52.2MB)
테스트 2 〉	통과 (0.14ms, 52.8MB)
테스트 3 〉	통과 (0.18ms, 53.2MB)
테스트 4 〉	통과 (0.16ms, 52.3MB)
테스트 5 〉	통과 (0.16ms, 53.2MB)
테스트 6 〉	통과 (0.07ms, 52.6MB)
테스트 7 〉	통과 (0.08ms, 52.1MB)
테스트 8 〉	통과 (0.17ms, 52.5MB)
테스트 9 〉	통과 (0.11ms, 52.4MB)
테스트 10 〉	통과 (0.61ms, 52.2MB)
테스트 11 〉	실패 (90.17ms, 83.8MB)
테스트 12 〉	통과 (0.55ms, 53MB)
테스트 13 〉	통과 (1.05ms, 52.6MB)
테스트 14 〉	통과 (1.44ms, 52.5MB)
테스트 15 〉	실패 (2.01ms, 52.1MB)
테스트 16 〉	통과 (2.15ms, 52.1MB)
테스트 17 〉	통과 (0.08ms, 54.1MB)
테스트 18 〉	실패 (4.64ms, 54.3MB)
테스트 19 〉	실패 (4.49ms, 52.8MB)
테스트 20 〉	실패 (4.23ms, 53.1MB)
 */

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_17680 {
    public int solution(int cacheSize, String[] cities) {
        //2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}),16)
        //"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"
        Queue<String> cache = new LinkedList< >();

        int size = 0;
        int count = 0;

        if(cacheSize==0) return cities.length * 5;

        for(String city : cities){
            if(cache.contains(city.toLowerCase())) {
                count+= 1;
            }else{

                if(size==cacheSize){
                    cache.poll();
                    size--;
                }

                count+= 5;
                cache.add(city.toLowerCase());
                size++;
            }
            System.out.println(cache);
        }

        return count;
    }
}

