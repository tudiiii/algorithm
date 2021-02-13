package 메뉴리뉴얼;

import java.util.*;

public class Programmers_72411 {

    static HashMap<String,Integer> map;
    static int m;

    public String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        for (int value : course) {
            map = new HashMap<>();
            m = 0;
            for (String order : orders) {
                find(0, "", value, 0, order);
            }
            for (String s : map.keySet()) {
                if (map.get(s) == m && m > 1) {
                    pq.offer(s);
                }
            }
        }
        String[] answer = new String[pq.size()];
        int k=0;
        while (!pq.isEmpty()){
            answer[k++] = pq.poll();
        }
        return answer;
    }

    static void find(int cnt,String str,int targetNum,int idx,String word){
        if (cnt==targetNum){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            StringBuilder temps= new StringBuilder();
            for (char value : c) temps.append(value);
            map.put(temps.toString(),map.getOrDefault(temps.toString(),0)+1);
            m = Math.max(m,map.get(temps.toString()));
            return;
        }

        for (int i=idx;i<word.length();i++){
            char now =word.charAt(i);
            find(cnt+1,str+now,targetNum,i+1,word);
        }
    }
}
