package 베스트앨범;

import java.util.*;
/*
테스트 1 〉	통과 (8.08ms, 53.2MB)
테스트 2 〉	통과 (3.49ms, 51.8MB)
테스트 3 〉	통과 (2.57ms, 52.6MB)
테스트 4 〉	통과 (2.79ms, 54MB)
테스트 5 〉	통과 (3.44ms, 52.9MB)
테스트 6 〉	통과 (2.73ms, 52.7MB)
테스트 7 〉	통과 (2.47ms, 54.2MB)
테스트 8 〉	통과 (2.29ms, 54MB)
테스트 9 〉	통과 (1.66ms, 52.5MB)
테스트 10 〉	통과 (2.73ms, 52.5MB)
테스트 11 〉	통과 (2.06ms, 53.1MB)
테스트 12 〉	통과 (3.10ms, 52.2MB)
테스트 13 〉	통과 (2.13ms, 52.8MB)
테스트 14 〉	통과 (2.65ms, 53.3MB)
테스트 15 〉	통과 (2.28ms, 52.5MB)
 */
public class Programmers_42579 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer, String> genreMap = new HashMap<>();
        HashMap<Integer, Integer> playMap = new HashMap<>();

        HashSet<String> playSet = new HashSet<>();

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

        TreeMap<Integer,String> tm = new TreeMap<>(genreCount);
        Iterator<Integer> iteratorKey = tm.descendingKeySet().iterator();   //키값 내림차순 정렬

        HashMap<Integer, Integer> tmpHash = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();


        for (Iterator<Integer> it = iteratorKey; it.hasNext(); ) {
            Integer key = it.next();
            for(int j=0;j<genreMap.size();j++){
                if(genreCount.get(key).equals(genreMap.get(j))){
                    tmpHash.put(j,playMap.get(j));
                }
            }

            List<Integer> tmpList = new ArrayList<>(tmpHash.keySet());
            tmpList.sort((o1, o2) -> (tmpHash.get(o2).compareTo(tmpHash.get(o1))));

            for(int i=0;i<tmpList.size();i++){
                answerList.add(tmpList.get(i));

                if(i==1) break;
            }

            tmpList.clear();
            tmpHash.clear();

        }

        int[] answer = new int[answerList.size()];

        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
