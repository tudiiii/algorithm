package 베스트앨범;

import java.util.HashMap;
import java.util.HashSet;

public class Programmers_42579 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer, String> genreMap = new HashMap<>();
        HashMap<Integer, Integer> playMap = new HashMap<>();

        HashSet<String> playSet = new HashSet();

        for(int i=0;i<genres.length;i++){
            genreMap.put(i,genres[i]);
            playMap.put(i,plays[i]);
            playSet.add(genres[i]); // 장르 중복 제거
        }

        //장르별 총 플레이 횟수
        HashMap<Integer, String> genreCount = new HashMap<>();
        for(String x : playSet){
            int count = 0;
            for(int i = 0; i < genreMap.size(); i++){
                if(genreMap.get(i).equals(x)){
                    count+= playMap.get(i);
                }
            }
            genreCount.put(count, x);
        }





        int[] answer = {};
        return answer;
    }
}
