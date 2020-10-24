/*
[1차] 캐
테스트 1 〉	통과 (0.16ms, 51.9MB)
테스트 2 〉	통과 (0.16ms, 52MB)
테스트 3 〉	통과 (0.16ms, 52.3MB)
테스트 4 〉	통과 (0.19ms, 53.1MB)
테스트 5 〉	통과 (0.15ms, 53MB)
테스트 6 〉	통과 (0.06ms, 52.2MB)
테스트 7 〉	통과 (0.08ms, 52.3MB)
테스트 8 〉	통과 (0.20ms, 52.9MB)
테스트 9 〉	통과 (0.16ms, 51.7MB)
테스트 10 〉	통과 (0.42ms, 52.5MB)
테스트 11 〉	통과 (57.42ms, 83.6MB)
테스트 12 〉	통과 (0.40ms, 52.7MB)
테스트 13 〉	통과 (0.62ms, 53.1MB)
테스트 14 〉	통과 (1.03ms, 52.8MB)
테스트 15 〉	통과 (1.34ms, 52.8MB)
테스트 16 〉	통과 (1.64ms, 53.1MB)
테스트 17 〉	통과 (0.10ms, 53.1MB)
테스트 18 〉	통과 (3.46ms, 52.7MB)
테스트 19 〉	통과 (3.99ms, 53.5MB)
테스트 20 〉	통과 (3.06ms, 52.6MB)
 */

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_17680 {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> cache = new LinkedList< >();

        int answer = 0;
        if(cacheSize==0) return cities.length * 5;

        for(String city : cities){
            city = city.toLowerCase();
            if(cache.contains(city)) {
                answer+= 1;
                cache.remove(city);
            }else{
                answer+= 5;

                if(cache.size()>=cacheSize){
                    cache.poll();
                }
            }
            cache.add(city);
        }

        return answer;
    }
}

